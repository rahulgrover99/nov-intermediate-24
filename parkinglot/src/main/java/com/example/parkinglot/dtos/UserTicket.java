package com.example.parkinglot.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserTicket {
    int ticketId;
    int slotId;
    int floorNumber;
    LocalDate time;
}
