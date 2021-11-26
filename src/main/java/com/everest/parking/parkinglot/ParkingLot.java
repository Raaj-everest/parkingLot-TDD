package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.services.*;
import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class ParkingLot extends ParkingArea {
    public static ParkingLot parkingLotInstance;
    private static Display display;
    private static Ticket ticket;
    private static Driver driver;
    private final String id;

    private ParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        super(numberOfFloors, numberOfSlotsPerFloor);
        this.id = id;
    }

    public static ParkingLot createParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot(id, numberOfFloors, numberOfSlotsPerFloor);
            driver = new Driver();
            display = new Display();
            ticket = new Ticket();
            String created = "Created parking lot with " + numberOfFloors + " floors and " + numberOfSlotsPerFloor + " slots per floor";
            System.out.println(created);
        }
        return parkingLotInstance;
    }


    public void park(Vehicle vehicle) {
        int[] place = driver.parkVehicle(vehicle, getAllSlotsInAllFloors(), getNumberOfSlotsPerFloor());
        ticket.print(place, getParkingLotId(), getNumberOfSlotsPerFloor(), getNumberOfFloors());
    }

    public void unPark(int floorNumber, int slotNumber) {
        driver.unParkVehicle(getSpecificSLotInSpecificFloor(floorNumber, slotNumber));
    }

    public void display(DisplayType displayType, VehicleType vehicleType) {
        if (displayType == DisplayType.FREE_COUNT) {
            display.freeCount(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType == DisplayType.FREE_SLOTS) {
            display.freeSlots(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType == DisplayType.OCCUPIED_SLOTS) {
            display.occupiedSlots(vehicleType, getAllFloorsInParkingArea());
        }
    }

    public String getParkingLotId() {
        return id;
    }

}
