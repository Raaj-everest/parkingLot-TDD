package com.everest.parking.parkinglot.services;

public class Ticket {

    public void generateTicket(int[] place, String parkingLotId, int numberOfSlotsPerFloor, int numberOfFloors) {
        if (place[0] == -1) {
            System.out.println("Parking Lot Full");
            return;
        }
        int floorNumber = place[0];
        int slotNumber = place[1];
        String ticket = (parkingLotId + "_" + (floorNumber + 1) + "_" + (slotNumber + 1));
        System.out.println("Parked vehicle. Ticket ID: " + ticket);
    }

}
