package com.example.parkinglot.service;

import com.example.parkinglot.models.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService {


    public Ticket createTicket() {
        return new Ticket();
    }
}
