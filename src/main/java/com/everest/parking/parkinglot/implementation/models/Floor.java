package com.everest.parking.parkinglot.models;

import com.everest.parking.parkinglot.models.Slot;

public class Floor {

    private final Slot[] slotsList;

    public Floor(int numberOfSlotsPerFloor) {
        slotsList = new Slot[numberOfSlotsPerFloor];
    }

//     public void addSlotsToFloor(int numberOfSlots) {
//        Slot[] tempArray = new Slot[this.slotsList.length + numberOfSlots];
//         System.arraycopy(slotsList, 0, tempArray, 0, this.slotsList.length);
//        this.slotsList = tempArray;
//    }

    public Slot[] getSlotsList() {
        return slotsList;
    }
}
