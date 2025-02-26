package com.example.parkinglot.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    String regNo;
    VehicleType vehicleType;
}
