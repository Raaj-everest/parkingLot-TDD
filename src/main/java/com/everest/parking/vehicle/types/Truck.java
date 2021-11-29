package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(String registrationNumber, String colour) {
        super(VehicleType.TRUCK, registrationNumber, colour);
    }

}
