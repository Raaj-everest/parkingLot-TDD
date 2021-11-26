package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public int[] parkVehicle(Vehicle vehicle, List<Slot> allSlots,int numberOfSlotsPerFloor ) {
        int count = 0;
        int[] place = new int[2];
        for (Slot slot : allSlots) {
            count++;
            if (!slot.getIsOccupied()) {
                slot.parkVehicleInSlot(vehicle);
                if (slot.getIsOccupied()) {
                    place[0] = ((count-1) / numberOfSlotsPerFloor);
                    place[1]= ((count-1) - (place[0] * numberOfSlotsPerFloor));
                    return place;
                }
            }
        }

        return null;
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
