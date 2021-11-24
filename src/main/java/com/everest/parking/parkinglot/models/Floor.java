package com.everest.parking.parkinglot.models;

import com.everest.parking.parkinglot.models.enums.SlotType;

public class Floor {

    private final Slot[] slotsList;

    public Floor(int numberOfSlotsPerFloor) {
        slotsList = new Slot[numberOfSlotsPerFloor];
        arrangeSlotsInOrder();
    }

//     public void addSlotsToFloor(int numberOfSlots) {
//        Slot[] tempArray = new Slot[this.slotsList.length + numberOfSlots];
//         System.arraycopy(slotsList, 0, tempArray, 0, this.slotsList.length);
//        this.slotsList = tempArray;
//    }

    public Slot[] getSlotsList() {
        return slotsList;
    }

    private void arrangeSlotsInOrder() {
        makeSmallSLots();
        makeMediumSlots();
        makeLargeSlots();
    }

    private void makeSmallSLots() {
        for (int i = 1; i < 3; i++) {
            slotsList[i] = new Slot(SlotType.SMALL);
        }
    }

    private void makeMediumSlots() {
        for (int i = 3; i < slotsList.length; i++) {
            slotsList[i] = new Slot(SlotType.MEDIUM);
        }
    }

    private void makeLargeSlots() {
        for (int i = 0; i < 1; i++) {
            slotsList[i] = new Slot(SlotType.LARGE);
        }
    }

}
