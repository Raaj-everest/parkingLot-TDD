package com.everest.parking.parkinglot;

public class ParkingLot {

    private Floor[] floors;

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
