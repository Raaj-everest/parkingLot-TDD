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

    public Slot[] getAllSlotsInSpecificFloor(int floorNumber) {
        return getAllFloorsInParkingArea()[(floorNumber)].getSlotsList();
    }

   public Slot getSpecificSLotInSpecificFloor(int floorNumber,int slotNumber){
        return getAllSlotsInSpecificFloor(floorNumber)[(slotNumber)];
   }

    public ArrayList<Slot> getAllSlotsInAllFloors() {
        ArrayList<Slot> allSlots = new ArrayList<>();
        for (Floor floor : floors) {
            Slot[] slot = floor.getSlotsList();
             for(int j=0;j<slot.length;j++){
                 allSlots.add(slot[j]);
             }
        }
        return allSlots;
    }
    public int getNumberOfFloors(){
        return floors.length;
    }
    public int getNumberOfSlotsPerFloor(){
        return getAllSlotsInSpecificFloor(0).length;
    }

}
