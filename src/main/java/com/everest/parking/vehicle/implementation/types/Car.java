package com.everest.parking.vehicle.implementation.types;

import com.everest.parking.vehicle.implementation.Vehicle;
import com.everest.parking.vehicle.implementation.types.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String registrationNumber, String colour) {
        super(VehicleType.CAR, registrationNumber, colour);

    }


}
