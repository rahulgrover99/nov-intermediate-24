package com.example.parkinglot.strategy;

import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSlot;
import com.example.parkinglot.models.Vehicle;

public interface SlotFindingStrategy {

    ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle);

}
