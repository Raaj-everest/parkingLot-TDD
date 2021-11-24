package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.Floor;

public class ParkingLotArea  {
    private final String id;
    private final Floor[] floors;
    private static ParkingLotArea parkingLotInstance=null;

    private ParkingLotArea(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        this.id = id;
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new Floor(numberOfSlotsPerFloor);
        }
    }

    public static ParkingLotArea createParkingLot(String parkingLotId, int numberOfFloors, int numberOfSlotsPerFloor) {
        if (parkingLotInstance==null) {
             parkingLotInstance = new ParkingLotArea(parkingLotId, numberOfFloors, numberOfSlotsPerFloor);
        }
        return parkingLotInstance;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public String getId() {
        return this.id;
    }
}
