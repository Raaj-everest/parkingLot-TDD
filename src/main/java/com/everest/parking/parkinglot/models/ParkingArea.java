package com.everest.parking.parkinglot.models;

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
        return getAllFloorsInParkingArea()[(floorNumber- 1)].getSlotsList();
    }

   public Slot getSpecificSLotInSpecificFloor(int floorNumber,int slotNumber){
        return getAllFloorsInParkingArea()[floorNumber].getSpecificSlotInTheFloor(slotNumber);
   }


}
