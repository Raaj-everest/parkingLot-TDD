package com.everest.parking.vehicle.implementation.types;

import com.everest.parking.vehicle.implementation.Vehicle;
import com.everest.parking.vehicle.implementation.types.enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String registrationNumber, String colour) {
        super(VehicleType.TRUCK, registrationNumber, colour);
    }

}
