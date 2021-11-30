package com.everest.parking.Controller;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.enums.DisplayType;
import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkinglotController {

    public static ParkingLot createParkingLot(List<String> input) {
        ParkingLot parkingLot = null;
        if (input.contains("CREATE_PARKING_LOT")) {
            try {
                String id = input.get(1);
                int numberOfFloors = Integer.parseInt(input.get(2));
                int numberOfSlotsPerFloor = Integer.parseInt(input.get(3));
                parkingLot = new ParkingLot(id, numberOfFloors, numberOfSlotsPerFloor);
            } catch (Exception e) {
                System.out.println("please give id,number of floors and number of slots per floor correctly");
            }
        } else {
            System.err.println("INVALID COMMAND : " + input);
            System.out.println("You have to create the parkinglot first to use the programme");
        }
        return parkingLot;
    }

    public static void operateParkinglot(ArrayList<String> input, ParkingLot parkingLot) {
        switch (input.get(0)) {
            case "DISPLAY":
                display(input, parkingLot);
                break;
            case "PARK_VEHICLE":
                parking(input, parkingLot);
                break;
            case "UNPARK_VEHICLE":
                unParking(input, parkingLot);
                break;
            case "HELP":
                parkingLot.help();
                break;
            default:
                System.out.println("try help to know about the programme");
                throw new IllegalStateException("Unexpected command: " + input.get(0));
        }

    }

    private static void display(ArrayList<String> input, ParkingLot parkingLot) {
        try {
            DisplayType displayType = DisplayType.valueOf(input.get(1));
            VehicleType vehicleType = VehicleType.valueOf(input.get(2));
            parkingLot.display(displayType, vehicleType);
        } catch (Exception e) {
            System.out.println("please select the available options");
            e.printStackTrace();

        }
    }

    private static void parking(ArrayList<String> input, ParkingLot parkingLot) {
        try {
            String vehicleType = input.get(1);
            String registrationNumber = input.get(2);
            String colour = input.get(3);
            parkingLot.park(new Vehicle(VehicleType.valueOf(vehicleType), registrationNumber, colour));
        } catch (Exception e) {
            System.out.println("give correct credentials for parking your car");
            e.printStackTrace();
        }
    }

    private static void unParking(ArrayList<String> input, ParkingLot parkingLot) {
        String registrationNumber = input.get(1);
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
