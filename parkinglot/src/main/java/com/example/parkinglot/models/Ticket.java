package com.example.parkinglot.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    int id;
    int operatorId;
    Gate gate;
    Vehicle vehicle;
    ParkingSlot parkingSlot;
    LocalDate issueTime;

    public Ticket() {
        this.id = 1;
    }

}
