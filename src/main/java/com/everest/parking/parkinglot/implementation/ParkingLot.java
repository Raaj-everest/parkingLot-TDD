package com.everest.parking.parkinglot.models;

import com.everest.parking.parkinglot.models.Floor;

public class ParkingLot {

    private final Floor[] floors;


    public ParkingLot(int numberOfFloors, int numberOfSlotsPerFloor) {
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new Floor(numberOfSlotsPerFloor);
        }
    }

    public Floor[] getFloors() {
        return floors;
    }


}
