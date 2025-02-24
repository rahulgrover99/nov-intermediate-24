package com.example.parkinglot.models;

import java.util.List;

public class ParkingLot {

    String name;
    String address;
    List<ParkingSlot> parkingSlots;
    List<Gate> entryGates;
    List<Gate> exitGates;
}
