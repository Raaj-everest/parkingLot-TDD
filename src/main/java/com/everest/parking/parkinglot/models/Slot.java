package com.everest.parking.parkinglot.models;

import com.everest.parking.parkinglot.models.enums.SlotType;
import com.everest.parking.vehicle.Vehicle;

public class Slot {
    private final SlotType slotType ;
    private boolean isOccupied;
    private Vehicle vehicleInSlot;

    public Slot(SlotType slotType) {
        this.slotType=slotType;
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

    public void parkVehicleInSlot(Vehicle vehicle){
        this.vehicleInSlot=vehicle;
        this.isOccupied=true;
    }



    public SlotType getSlotType() {
        return slotType;
    }
}
