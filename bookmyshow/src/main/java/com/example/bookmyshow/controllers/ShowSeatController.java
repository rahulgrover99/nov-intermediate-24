package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.SeatMap;
import com.example.bookmyshow.service.ShowSeatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class ShowSeatController {


    ShowSeatService showSeatService;

    public ShowSeatController(ShowSeatService showSeatService) {
        this.showSeatService = showSeatService;
    }

    @GetMapping("/{showId}")
    public SeatMap getSeatMap(@PathVariable(name = "showId") Long showId) {
        return new SeatMap(showSeatService.findShowSeatsByShowId(showId));
    }

}
