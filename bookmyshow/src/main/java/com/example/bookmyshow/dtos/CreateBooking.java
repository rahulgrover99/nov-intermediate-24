package com.example.bookmyshow.dtos;

import lombok.Data;
import lombok.Getter;

import java.util.List;


public class CreateBooking {
    List<Long> seatIds;

    public List<Long> getSeatIds() {
        return seatIds;
    }

    public CreateBooking setSeatIds(List<Long> seatIds) {
        this.seatIds = seatIds;
        return this;
    }
}
