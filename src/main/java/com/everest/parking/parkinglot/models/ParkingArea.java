package com.everest.parking.parkinglot.models;

import java.util.ArrayList;
import java.util.Collections;

public class ParkingArea {

    private final Floor[] floors;

    public ParkingArea(int numberOfFloors, int numberOfSlotsPerFloor) {
        floors = new Floor[numberOfFloors];
        setSlotsInFloor(numberOfSlotsPerFloor);
    }

    private void setSlotsInFloor(int numberOfSlotsPerFloor) {
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(numberOfSlotsPerFloor);
        }
    }

    public Floor[] getAllFloorsInParkingArea() {
        return floors;
    }

    public Floor getSpecificFloorInParkingArea(int floorNumber) {
        return getAllFloorsInParkingArea()[floorNumber - 1];
    }

    public Slot[] getAllSlotsInSpecificFloor(int floorNumber) {
        return getSpecificFloorInParkingArea(floorNumber).getSlotsList();
    }

    public Slot getSpecificSLotInSpecificFloor(int floorNumber, int slotNumber) {
        return getAllSlotsInSpecificFloor(floorNumber)[slotNumber-1];
    }

    public ArrayList<Slot> getAllSlotsInAllFloors() {
        ArrayList<Slot> allSlots = new ArrayList<>();
        for (Floor floor : floors) {
            Slot[] slot = floor.getSlotsList();
            Collections.addAll(allSlots, slot);
        }
        return allSlots;
    }

    public int getNumberOfFloors() {
        return floors.length;
    }

    public int getNumberOfSlotsPerFloor() {
        return getAllSlotsInSpecificFloor(1).length;
    }

}
