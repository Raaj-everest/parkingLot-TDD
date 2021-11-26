package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;

import java.util.ArrayList;

public class Driver {
    private ParkingLot parkingLot;

    public Driver(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void parkVehicle(Vehicle vehicle) {
        int count = 0;
        ArrayList<Slot> allSlots = parkingLot.getAllSlotsInAllFloors();
        for (Slot slot : allSlots) {
            count++;
            if (!slot.getIsOccupied()) {
                slot.parkVehicleInSlot(vehicle);
                if (slot.getIsOccupied()) {
                    parkingLot.getTicket().print(count);
                    return;
                }
            }
        }
        if (count == allSlots.size()) {
            System.out.println("Parking Lot Full");
        }
    }
    public void unParkVehicle(int floorNumber,int slotNumber){
        Slot slot = parkingLot.getSpecificSLotInSpecificFloor(floorNumber, slotNumber);
        if (slot.getIsOccupied()) {
            System.out.println("Unparked vehicle with Registration Number: " + slot.getVehicleInSlot().getRegistrationNumber() + " and Color: " + slot.getVehicleInSlot().getColourOfVehicle());
            slot.removeVehicleInSlot();
        } else {
            System.out.println("Invalid Ticket");
        }
    }
}
