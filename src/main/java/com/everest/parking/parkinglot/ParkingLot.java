package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.enums.DisplayType;
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
        ticket.generateTicket(place,id, getNumberOfSlotsPerFloor(), getNumberOfFloors());
    }

    public void unPark(int floorNumber, int slotNumber) {
        driver.unParkVehicle(getSpecificSLotInSpecificFloor(floorNumber, slotNumber));
    }

    public void display(DisplayType displayType, VehicleType vehicleType) {
        if (displayType.equals(DisplayType.FREE_COUNT)) {
            display.showFreeCount(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType.equals(DisplayType.FREE_SLOTS)) {
            display.showFreeSlots(vehicleType, getAllFloorsInParkingArea());
        }
        if (displayType.equals(DisplayType.OCCUPIED_SLOTS)) {
            display.showOccupiedSlots(vehicleType, getAllFloorsInParkingArea());
        }
    }

    public void help() {
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println("|===========this is a plafrom for maintaining parking lot===============|");
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|->     you can Manage the parking lot by following commands            |");
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|create_parking_lot <Building_ID> <Number_Of_floors> <Number_of_slots>  |");
        System.out.println("|park_vehicle <rigistration_number> <colour>                            |");
        System.out.println("|unpark_vehicle <rigistration_number> <colour>                          |");
        System.out.println("|display free_count <vehicle_type>                                      |");
        System.out.println("|display free_slots <vehicle_type>                                      |");
        System.out.println("|display occupied_slots <vehicle_type>                                  |");
        System.out.println("|exit                                                                   |");
        System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
        System.out.println();
    }


}
