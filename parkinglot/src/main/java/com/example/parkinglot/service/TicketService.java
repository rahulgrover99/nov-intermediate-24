package com.example.parkinglot.service;

import com.example.parkinglot.models.*;
import com.example.parkinglot.repository.GateRepository;
import com.example.parkinglot.repository.TicketRepository;
import com.example.parkinglot.strategy.BasicSlotFindingStrategy;
import com.example.parkinglot.strategy.SlotFindingStrategy;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Random;

@Service
public class TicketService {

    private final GateRepository gateRepository;
    private final SlotFindingStrategy slotFindingStrategy;
    private final TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.slotFindingStrategy = new BasicSlotFindingStrategy();
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Vehicle vehicle, Long gateId) {
        // 1. Fetch the gate, and parking lot object from gate ID
        // 2. find a suitable slot in that parking lot
        // 3. update the slot in that parking lot
        // 4. return the ticket object.

        // Database call.

        Gate gate = gateRepository.findById(gateId);


        ParkingSlot parkingSlot = slotFindingStrategy
                .findParkingSlot(gate.getParkingLot(), vehicle);

        if (parkingSlot == null) {
            throw new RuntimeException("Parking lot is full");
        }

        parkingSlot.setSlotState(SlotState.OCCUPIED);
        parkingSlot.setVehicle(vehicle);

        Ticket ticket = Ticket
                .builder()
                .id(new Random().nextInt())
                .operatorId(gate.getOperatorId())
                .gate(gate)
                .issueTime(LocalDate.now())
                .parkingSlot(parkingSlot)
                .vehicle(vehicle)
                .build();
        ticketRepository.save(ticket);
        return ticket;
    }
}
