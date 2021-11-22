package com.everest.parking.vehicle.implementation;

import com.everest.parking.vehicle.DefaultVehicle;
import com.everest.parking.vehicle.implementation.types.enums.VehicleType;

public abstract class Vehicle implements DefaultVehicle {

    private final String registrationNumber;
    private final String colour;
    private final String typeOfVehicle;

    public Vehicle(VehicleType typeOfVehicle, String registrationNumber, String colour) {
        this.registrationNumber = registrationNumber;
        this.colour = colour;
        this.typeOfVehicle = typeOfVehicle.toString();
    }

    public String getColourOfVehicle() {
        return this.colour;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }
}
