package com.everest.parking.vehicle.implementation.types;

import com.everest.parking.vehicle.implementation.Vehicle;
import com.everest.parking.vehicle.implementation.types.enums.VehicleType;

public class Bike extends Vehicle {

    public Bike(VehicleType typeOfVehicle, String registrationNumber, String colour) {
        super(VehicleType.BIKE, registrationNumber, colour);

    }
}
