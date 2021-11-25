package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingLot extends ParkingArea {
    public static ParkingLot parkingLotInstance = null;
    private final String id;

    private ParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        super(numberOfFloors, numberOfSlotsPerFloor);
        this.id = id;
    }

    public static ParkingLot createParkingLot(String parkingLotId, int numberOfFloors, int numberOfSlotsPerFloor) {
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot(parkingLotId, numberOfFloors, numberOfSlotsPerFloor);
        }
        return parkingLotInstance;
    }

    private String getParkingLotId() {
        return id;
    }

    public void park(Vehicle vehicle) {
        int count = 0;
        ArrayList<Slot> allSlots = getAllSlotsInAllFloors();
        for (Slot slot : allSlots) {
            count++;
            if (!slot.getIsOccupied()) {
                slot.parkVehicleInSlot(vehicle);
                if (slot.getIsOccupied()) {
                    generateTicket(count);
                    return;
                }
            }
        }
    }

    private void generateTicket(int counter) {
        int floorNumber = ((counter - 1) / (getNumberOfSlotsPerFloor() + 1));
        int slotNumber = ((counter - 1) - (floorNumber * getNumberOfSlotsPerFloor()));
        String ticket = getParkingLotId() + "_" + (floorNumber + 1) + "_" + (slotNumber + 1);
        System.out.println("parked Vehicle. ticket ID: " + ticket);
    }

    public void unPark(int floorNumber, int slotNumber) {
        getSpecificSLotInSpecificFloor(floorNumber, slotNumber).removeVehicleInSlot();
    }


}
