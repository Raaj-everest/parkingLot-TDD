package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.vehicle.Vehicle;

public class Ticket {

    public static void generateTicket(int counter, ParkingLot parkingLot) {
        int floorNumber = ((counter ) / (parkingLot.getNumberOfSlotsPerFloor() ));
        int slotNumber = ((counter ) - (floorNumber * parkingLot.getNumberOfSlotsPerFloor()));
        String ticket = parkingLot.getParkingLotId() + "_" + (floorNumber + 1) + "_" + (slotNumber + 1);
        System.out.println("parked Vehicle. ticket ID: " + ticket);
    }
}
