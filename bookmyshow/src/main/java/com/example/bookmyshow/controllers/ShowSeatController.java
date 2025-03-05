package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.SeatMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class ShowSeatController {

    @GetMapping("/{showId}")
    public SeatMap getSeatMap(@PathVariable(name = "showId") int showId) {
        return null;
    }

}
