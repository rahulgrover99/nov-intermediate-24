package com.example.bookmyshow.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class SeatsAlreadyBookedException extends RuntimeException {
    public SeatsAlreadyBookedException() {
        super("Seats have already been booked");
    }
}
