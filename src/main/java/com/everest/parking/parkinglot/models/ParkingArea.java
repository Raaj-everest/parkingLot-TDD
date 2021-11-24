package com.everest.parking.parkinglot.models;

public class ParkingArea {
    private final String id;
    private final Floor[] floors;

    public ParkingArea(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        this.id = id;
        floors = new Floor[numberOfFloors];
        setSlotsInFloor(numberOfSlotsPerFloor);
    }

    private void setSlotsInFloor(int numberOfSlotsPerFloor) {
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(numberOfSlotsPerFloor);
        }
    }

    public Floor[] getFloors() {
        return floors;
    }


    public String getId() {
        return this.id;
    }
}
