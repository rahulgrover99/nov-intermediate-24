package com.example.bookmyshow.service;

import com.example.bookmyshow.exceptions.SeatsAlreadyBookedException;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.ShowSeatStatus;
import com.example.bookmyshow.repository.BookingRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    BookingRepository bookingRepository;
    ShowSeatRepository showSeatRepository;

    public BookingService(BookingRepository bookingRepository, ShowSeatRepository showSeatRepository) {
        this.bookingRepository = bookingRepository;
        this.showSeatRepository = showSeatRepository;
    }

    /*
    1. Fetch the show seats from the DB.
    2. Verify the status of the seats as available.
    3. Change the status of the seats to block and allow user some time to make payment.
    4. Finally, create the booking object.
     */


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(List<Long> showSeatList) {
        // SELECT * FROM show_seats where id IN [];
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatList);


        // Testing only.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 1 2 3 4 5 6
        // Book 5, 6, 7
        // 5, 6 returned from DB
        // The query was invalid.
        if (showSeats.isEmpty() || showSeats.size() != showSeatList.size()) {
            throw new IllegalArgumentException("Invalid show seats.");
        }

        int totalAmount = 0;
        // For every seat check if the seat was available and then change the status
        // to reserved.
        for (ShowSeat showSeat: showSeats) {
            if (!showSeat.getShowSeatStatus().equals(ShowSeatStatus.FREE)) {
                throw new SeatsAlreadyBookedException();
            }
            showSeat.setShowSeatStatus(ShowSeatStatus.RESERVED);
            totalAmount += showSeat.getPrice();
        }


        // Build the booking object
        Booking booking = Booking.builder()
                .show(showSeats.get(0).getShow())
                .showSeat(showSeats)
                .bookedAt(Date.from(LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC)))
                .totalAmount(totalAmount)
                .build();
        showSeatRepository.saveAll(showSeats);
        booking = bookingRepository.save(booking);
        return booking;
    }

}
