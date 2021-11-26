package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.functions.Display;
import com.everest.parking.parkinglot.functions.Driver;
import com.everest.parking.parkinglot.functions.Ticket;
import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.vehicle.Vehicle;

public class ParkingLot extends ParkingArea {
    public static ParkingLot parkingLotInstance = null;
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
            driver = new Driver(parkingLotInstance);
            display = new Display(parkingLotInstance);
            ticket = new Ticket(parkingLotInstance);
            System.out.println("Created parking lot with " + numberOfFloors + " floors and " + numberOfSlotsPerFloor + " slots per floor");
        }
        return parkingLotInstance;
    }


    public void park(Vehicle vehicle) {
        driver.parkVehicle(vehicle);
    }

    public void unPark(int floorNumber, int slotNumber) {
        driver.unParkVehicle(floorNumber, slotNumber);
    }

    public Display getDisplay() {
        return display;
    }

    public String getParkingLotId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
