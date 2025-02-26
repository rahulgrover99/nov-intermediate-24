package com.example.parkinglot.repository;


import com.example.parkinglot.models.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GateRepository {

    private final Map<Long, Gate> gates = fillGates();


    public Gate findById(Long id) {
        return gates.get(id);
    }

    private static Map<Long, Gate> fillGates() {
        Map<Long, Gate> gates = new HashMap<>();

        ParkingSlot parkingSlot1 = ParkingSlot.builder()
                .floor(1)
                .slotType(SlotType.NORMAL)
                .vehicleType(VehicleType.SUV)
                .id(1)
                .slotState(SlotState.FREE)
                .build();
        ParkingSlot parkingSlot2 = ParkingSlot.builder()
                .floor(2)
                .slotType(SlotType.VIP)
                .vehicleType(VehicleType.SEDAN)
                .slotState(SlotState.FREE)
                .id(10)
                .build();

        ParkingLot parkingLot = ParkingLot.builder()
                .name("Ambience Mall")
                .address("Gurugram")
                .parkingSlots(List.of(parkingSlot1, parkingSlot2))
                .build();

        Gate gate1 = Gate.builder()
                .id(1)
                .operatorId(1)
                .gateType(GateType.ENTRY)
                .parkingLot(parkingLot)
                .build();

        gates.put(1L, gate1);
        return gates;
    }

}
