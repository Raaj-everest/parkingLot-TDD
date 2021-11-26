package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.DisplayType;
import com.everest.parking.parkinglot.services.*;
import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class ParkingLot extends ParkingArea {
    private final String id;
    private final Display display;
    private final Ticket ticket;
    private final Driver driver;

    public ParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        super(numberOfFloors, numberOfSlotsPerFloor);
        this.id = id;
        driver = new Driver();
        display = new Display();
        ticket = new Ticket();
        String created = "Created parking lot with " + numberOfFloors + " floors and " + numberOfSlotsPerFloor + " slots per floor";
        System.out.println(created);
    }

    public void park(Vehicle vehicle) {
        int[] place = driver.parkVehicle(vehicle, getAllSlotsInAllFloors(), getNumberOfSlotsPerFloor());
        ticket.print(place,id, getNumberOfSlotsPerFloor(), getNumberOfFloors());
    }

    public void unPark(int floorNumber, int slotNumber) {
        driver.unParkVehicle(getSpecificSLotInSpecificFloor(floorNumber, slotNumber));
    }

    public void display(DisplayType displayType, VehicleType vehicleType) {
        if (displayType.equals(DisplayType.FREE_COUNT)) {
            display.freeCount(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType.equals(DisplayType.FREE_SLOTS)) {
            display.freeSlots(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType.equals(DisplayType.OCCUPIED_SLOTS)) {
            display.occupiedSlots(vehicleType, getAllFloorsInParkingArea());
        }
    }


}
