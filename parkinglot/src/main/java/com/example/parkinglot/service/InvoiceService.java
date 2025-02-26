package com.example.parkinglot.service;

import com.example.parkinglot.models.*;
import com.example.parkinglot.repository.GateRepository;
import com.example.parkinglot.repository.InvoiceRepository;
import com.example.parkinglot.repository.TicketRepository;
import com.example.parkinglot.strategy.FareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final TicketRepository ticketRepository;
    private final GateRepository gateRepository;

    private final FareCalculationStrategy fareCalculationStrategy;

    public InvoiceService(InvoiceRepository invoiceRepository, TicketRepository ticketRepository, GateRepository gateRepository) {
        this.invoiceRepository = invoiceRepository;
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.fareCalculationStrategy = null;
    }

    public Invoice generateInvoice(Long ticketId, Long gateId) {
        // 1. Fetch the ticket object from the DB for the ticket ID
        // 2. Fetch the gate from the DB
        // 3. Based on a strategy, calculate the amount due
        // 4. Free up the parking slot.
        // 5. Return the invoice object.


        Ticket ticket = ticketRepository.findById(ticketId);
        Gate gate = gateRepository.findById(gateId);

        // TODO;
//        int amount = fareCalculationStrategy.getFare();

        int amount = 0;

        ParkingSlot parkingSlot = ticket.getParkingSlot();

        parkingSlot.setVehicle(null);
        parkingSlot.setSlotState(SlotState.FREE);

        // Invoice for the request

        return null;
    }
}
