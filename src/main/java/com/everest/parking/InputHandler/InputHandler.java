package com.everest.parking.InputHandler;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.enums.DisplayType;
import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputHandler {

    public static ArrayList<String> input(String str) {
        str = str.toUpperCase();
        str = str.trim();
        String[] newStr = str.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, newStr);
        return list;
    }

    public static ParkingLot createParkingLot(List<String> str) {
        ParkingLot parkingLot = null;
        if (str.contains("CREATE_PARKING_LOT")) {
            try {
                String id = str.get(1);
                int numberOfFloors = Integer.parseInt(str.get(2));
                int numberOfSlotsPerFloor = Integer.parseInt(str.get(3));
                parkingLot = new ParkingLot(id, numberOfFloors, numberOfSlotsPerFloor);
            } catch (Exception e) {
                System.out.println("please give id,number of floors and number of slots per floor correctly");
            }
        } else {
            System.out.println("INVALID COMMAND : " + str);
            System.out.println("You have to create the parkinglot first to use the programme");
        }
        return parkingLot;
    }

    public static void doWork(ArrayList<String> str, ParkingLot parkingLot) {
        if (str.contains("DISPLAY")) {
            display(str, parkingLot);
        } else if (str.contains("PARK_VEHICLE")) {
            park(str, parkingLot);
        } else if (str.contains("UNPARK_VEHICLE")) {
            unPark(str, parkingLot);
        } else if (str.contains("HELP")) {
            parkingLot.help();
        } else {
            System.out.println("INVALID COMMAND : " + str);
            System.out.println("try help to know about the programme");
        }
    }

    private static void display(ArrayList<String> str, ParkingLot parkingLot) {
        try {
            DisplayType displayType = DisplayType.valueOf(str.get(1));
            VehicleType vehicleType = VehicleType.valueOf(str.get(2));
            parkingLot.display(displayType, vehicleType);
        } catch (Exception e) {
            System.out.println("please select the available options");
            e.printStackTrace();

        }
    }

    private static void park(ArrayList<String> str, ParkingLot parkingLot) {
        try {
            String vehicleType = str.get(1);
            String registrationNumber = str.get(2);
            String colour = str.get(3);
            parkingLot.park(new Vehicle(VehicleType.valueOf(vehicleType), registrationNumber, colour));
        } catch (Exception e) {
            System.out.println("give correct credentials for parking your car");
            e.printStackTrace();
        }
    }

    private static void unPark(ArrayList<String> str, ParkingLot parkingLot) {
        String registrationNumber = str.get(1);
        String[] parts = registrationNumber.split("_");
        try {
            int floorNUmber = Integer.parseInt(parts[1]);
            int slotNumber = Integer.parseInt(parts[2]);
            parkingLot.unPark(floorNUmber, slotNumber);
        } catch (Exception w) {
            System.out.println("give correct credentials for un-parking your car");
            w.printStackTrace();
        }
    }
}
