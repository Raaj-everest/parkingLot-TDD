package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.ParkingArea;

class ParkingLot extends ParkingArea {
    public static ParkingLot parkingLotInstance=null;

    private ParkingLot(String id,int numberOfFloors,int numberOfSlotsPerFloor){
        super(id, numberOfFloors, numberOfSlotsPerFloor);
    }

    public static ParkingArea createParkingLot(String parkingLotId, int numberOfFloors, int numberOfSlotsPerFloor) {
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot(parkingLotId, numberOfFloors, numberOfSlotsPerFloor);
        }
        return parkingLotInstance;
    }

}
