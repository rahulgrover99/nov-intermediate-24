package com.example.parkinglot.controllers;


import com.example.parkinglot.dtos.CreateTicket;
import com.example.parkinglot.dtos.UserTicket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TicketControllerTest {

    @Autowired
    TicketController ticketController;


    @Test
    public void testController() {
        UserTicket userTicket = ticketController.createTicket(new CreateTicket());
        assertThat(userTicket.getTicketId()).isEqualTo(0);
    }

}
