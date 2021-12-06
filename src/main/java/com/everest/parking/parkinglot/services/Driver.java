package com.everest.parking.parkinglot.services;

import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;

import java.util.List;

public class Driver {

    public int[] parkVehicle(Vehicle vehicle, List<Slot> allSlots,int numberOfSlotsPerFloor ) {
        int count = 0;
        int[] whereVehicleIsParked = new int[2];
        for (Slot slot : allSlots) {
            count++;
            if (!slot.getIsOccupied()) {
                slot.parkVehicleInSlot(vehicle);
                if (slot.getIsOccupied()) {
                    whereVehicleIsParked[0] = ((count-1) / numberOfSlotsPerFloor);
                    whereVehicleIsParked[1]= ((count-1) - (whereVehicleIsParked[0] * numberOfSlotsPerFloor));
                    return whereVehicleIsParked;
                }
            }
        }

        return new int[]{-1, -1};
    }
    public void unParkVehicle(Slot slot){
        if (slot.getIsOccupied()) {
            System.out.println("Unparked vehicle with Registration Number: " + slot.getVehicleInSlot().getRegistrationNumber() + " and Color: " + slot.getVehicleInSlot().getColourOfVehicle());
            slot.removeVehicleInSlot();
        } else {
            System.out.println("Invalid Ticket");
        }
    }
}
