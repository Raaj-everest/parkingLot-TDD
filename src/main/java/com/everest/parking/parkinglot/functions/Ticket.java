package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;

public class Ticket {

    private static String generateTicket(int counter, ParkingLot parkingLot) {

        int floorNumber = ((counter-1) / (parkingLot.getNumberOfSlotsPerFloor()));
        int slotNumber = ((counter-1) - (floorNumber * parkingLot.getNumberOfSlotsPerFloor()));

        String ticket = parkingLot.getParkingLotId() + "_" + (floorNumber + 1) + "_" + (slotNumber+1);
        return "parked Vehicle. ticket ID: " + ticket;
    }

    public static void print(int Count, ParkingLot parkingLot) {

        System.out.println(Ticket.generateTicket(Count, parkingLot));
    }
}
