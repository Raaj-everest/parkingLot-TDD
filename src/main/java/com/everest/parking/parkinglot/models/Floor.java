package com.everest.parking.parkinglot.models;

import com.everest.parking.parkinglot.models.enums.SlotType;

public class Floor {

    private final Slot[] slotsList;

    public Floor(int numberOfSlotsPerFloor) {
        slotsList = new Slot[numberOfSlotsPerFloor];
        arrangeSlotsInOrder();
    }

    private void arrangeSlotsInOrder() {
        makeBikeSLots();
        makeCarSlots();
        makeTruckSlots();
    }

    private void makeBikeSLots() {
        int startingOfBikeSlots = 1;
        int endingOfBikeSlots = 3;
        for (int bikeSlot = startingOfBikeSlots; bikeSlot < endingOfBikeSlots; bikeSlot++) {
            slotsList[bikeSlot] = new Slot(SlotType.BIKE);
        }
    }

    private void makeCarSlots() {
        int startingOfCarSlots = 3;
        int endingOfCarSlots = slotsList.length;
        for (int carSlot = startingOfCarSlots; carSlot < endingOfCarSlots; carSlot++) {
            slotsList[carSlot] = new Slot(SlotType.CAR);
        }
    }

    private void makeTruckSlots() {
        int startingOfTruckSlots = 0;
        int endingOfTruckSlots = 1;
        for (int truckSlot = startingOfTruckSlots; truckSlot < endingOfTruckSlots; truckSlot++) {
            slotsList[truckSlot] = new Slot(SlotType.TRUCK);
        }
    }

    public Slot getSpecificSlotInTheFloor(int slotNumber) {
        return slotsList[(slotNumber - 1)];
    }

    public Slot[] getSlotsList() {
        return slotsList;
    }

}
