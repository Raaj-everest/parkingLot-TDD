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
        for (int i = 1; i < 3; i++) {
            slotsList[i] = new Slot(SlotType.BIKE);
        }
    }

    private void makeCarSlots() {
        for (int i = 3; i < slotsList.length; i++) {
            slotsList[i] = new Slot(SlotType.CAR);
        }
    }

    private void makeTruckSlots() {
        for (int i = 0; i < 1; i++) {
            slotsList[i] = new Slot(SlotType.TRUCK);
        }
    }

    public Slot getSpecificSlotInTheFloor(int slotNumber) {
        return slotsList[(slotNumber - 1)];
    }

    public Slot[] getSlotsList() {
        return slotsList;
    }

}
