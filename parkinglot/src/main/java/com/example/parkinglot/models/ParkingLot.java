package com.example.parkinglot.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParkingLot {
    String name;
    String address;
    List<ParkingSlot> parkingSlots;
    List<Gate> entryGates;
    List<Gate> exitGates;
}
