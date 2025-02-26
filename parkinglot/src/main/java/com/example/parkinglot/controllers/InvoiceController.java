package com.example.parkinglot.controllers;


import com.example.parkinglot.dtos.UserTicket;
import com.example.parkinglot.models.Invoice;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.service.InvoiceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    // TODO: Change Invoice to DTO object

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/invoice")
    public Invoice generateInvoice(UserTicket userTicket) {
        return invoiceService.generateInvoice(userTicket.getTicketId(), 1L);
    }
}
