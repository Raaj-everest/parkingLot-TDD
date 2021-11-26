package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;

public class Ticket {
    private ParkingLot parkingLot;

    public Ticket(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void print(int counter) {
        int floorNumber = ((counter-1) / (this.parkingLot.getNumberOfSlotsPerFloor()));
        int slotNumber = ((counter-1) - (floorNumber * this.parkingLot.getNumberOfSlotsPerFloor()));
         String ticket = (this.parkingLot.getParkingLotId() + "_" + (floorNumber + 1) + "_" + (slotNumber+1));
        System.out.println("Parked vehicle. Ticket ID: " + ticket);
    }


}
