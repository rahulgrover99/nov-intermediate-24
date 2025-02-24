package com.example.parkinglot.models;

import java.time.LocalDate;

public class Invoice {
    int id;
    int amount;
    Ticket ticket;
    LocalDate exitTime;
    Gate gate;
    int operatorId;
}
