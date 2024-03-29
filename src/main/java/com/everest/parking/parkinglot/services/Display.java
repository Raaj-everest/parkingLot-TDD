package com.everest.parking.parkinglot.services;

import com.everest.parking.parkinglot.models.*;
import com.everest.parking.vehicle.types.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Display {

    public void showFreeCount(VehicleType vehicleType, Floor[] floors) {
        int counter = 0;
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (Slot slot : slots) {
                if ((Objects.equals(slot.getSlotType(), vehicleType.toString())) && !slot.getIsOccupied()) {
                    counter += 1;
                }
            }
            System.out.println("No. of free slots for " + vehicleType.toString() + " on Floor " + i + " : " + counter);
            counter = 0;
        }
    }

    public void showFreeSlots(VehicleType vehicleType, Floor[] floors) {
        List<Integer> freeSlots = new ArrayList<>();
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (int j = 0; j < slots.length; j++) {
                if ((Objects.equals(slots[j].getSlotType(), vehicleType.toString())) && !slots[j].getIsOccupied()) {
                    freeSlots.add(j + 1);
                }
            }
            System.out.print("No. of free slots for " + vehicleType.toString() + " on Floor " + (i + 1) + " :");
            printSlotNumbers(freeSlots);
            freeSlots.clear();
        }
    }

    public void showOccupiedSlots(VehicleType vehicleType, Floor[] floors) {
        List<Integer> occupiedSLots = new ArrayList<>();
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (int j = 0; j < slots.length; j++) {
                if ((Objects.equals(slots[j].getSlotType(), vehicleType.toString())) && slots[j].getIsOccupied()) {
                    occupiedSLots.add(j + 1);
                }
            }
            System.out.print("No. of occupied slots for " + vehicleType.toString() + " on Floor " + (i + 1) + " : ");
            printSlotNumbers(occupiedSLots);
            occupiedSLots.clear();
        }
    }

    private void printSlotNumbers(List<Integer> slots) {
        for (int l = 0; l < slots.size(); l++) {
            System.out.print(slots.get(l));
            if (l != (slots.size() - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();

    }
}





