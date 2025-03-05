package com.example.bookmyshow.service;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repository.ShowRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowSeatService {

    private final ShowRepository showRepository;
    private final ShowSeatRepository showSeatRepository;

    public ShowSeatService(ShowRepository showRepository, ShowSeatRepository showSeatRepository) {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public List<ShowSeat> findShowSeatsByShowId(Long showId) {
        // SELECT * from shows where id = showID;
        Optional<Show> showOptional = showRepository.findById(showId);

        if (!showOptional.isPresent()) {
            throw new IllegalArgumentException("Show not found");
        }

        return showSeatRepository.findAllByShow(showOptional.get());
    }
}
