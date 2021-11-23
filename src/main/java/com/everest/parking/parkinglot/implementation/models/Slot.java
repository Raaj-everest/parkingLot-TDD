package com.everest.parking.parkinglot.models;

import com.everest.parking.vehicle.Vehicle;

public class Slot {

    private boolean isOccupied;
    private Vehicle vehicleInSlot;

    public Slot(Vehicle vehicleInSlot) {
        this.vehicleInSlot = vehicleInSlot;
        this.isOccupied = true;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public Vehicle getVehicleInSlot() {
        return vehicleInSlot;
    }

    public void removeVehicleInSlot() {
        this.vehicleInSlot = null;
        this.isOccupied = false;
    }
}
