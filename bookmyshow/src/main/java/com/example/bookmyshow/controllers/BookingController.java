package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.CreateBooking;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.service.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping()
    public Booking createBooking(@RequestBody CreateBooking createBooking) {


        return bookingService.bookTicket(createBooking.getSeatIds());
    }
}
