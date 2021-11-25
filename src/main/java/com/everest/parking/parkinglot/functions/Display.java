package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.Floor;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.types.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Display {
    static int freeCount(ParkingLot parkingLot, VehicleType vehicleType) {
        int counter = 0;
        Floor[] floors = parkingLot.getAllFloorsInParkingArea();
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (int j = 0; j < slots.length; j++) {
                if ((slots[j].getSlotType() == vehicleType.toString()) && !slots[j].getIsOccupied()) {
                    counter += 1;
                }
            }
            System.out.println("No. of free slots for " + vehicleType.toString() + " on Floor " + i + " : " + counter);
            counter = 0;
        }
        return counter;
    }


    static void freeSlots(ParkingLot parkingLot, VehicleType vehicleType) {
        Floor[] floors = parkingLot.getAllFloorsInParkingArea();
        List<Integer> freeSlots = new ArrayList<>();
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (int j = 0; j < slots.length; j++) {
                if ((slots[j].getSlotType() == vehicleType.toString()) && !slots[j].getIsOccupied()) {
                    freeSlots.add(j + 1);
                }
            }
            System.out.print("No. of free slots for " + vehicleType.toString() + " on Floor " + (i + 1) + " :" );
            printSlotNumber(freeSlots);
            freeSlots.clear();
        }
        return;

    }

    static void occupiedSlots(ParkingLot parkingLot, VehicleType vehicleType) {
        Floor[] floors = parkingLot.getAllFloorsInParkingArea();
        List<Integer> freeSlots = new ArrayList<>();
        for (int i = 0; i < floors.length; i++) {
            Slot[] slots = floors[i].getSlotsList();
            for (int j = 0; j < slots.length; j++) {
                if ((slots[j].getSlotType() == vehicleType.toString()) && slots[j].getIsOccupied()) {
                    freeSlots.add(j + 1);
                }
            }
            System.out.print("No. of free slots for " + vehicleType.toString() + " on Floor " + (i + 1) + " : "  );
            printSlotNumber(freeSlots);
            freeSlots.clear();
        }
        return;
    }

    private static void printSlotNumber(List<Integer> slots) {
        for (int l = 0; l < slots.size(); l++) {
            System.out.print( slots.get(l));
            if (l != (slots.size() - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();

    }
}





