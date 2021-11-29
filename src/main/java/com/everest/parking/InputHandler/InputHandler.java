package com.everest.parking.InputHandler;

import com.everest.parking.parkinglot.ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InputHandler {
    public static ArrayList<String> input(String str){
        str = str.toUpperCase();
        str = str.trim();
        String[] newStr = str.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,newStr);
        return list;
    }
    public static ParkingLot buildParkingLot(List<String> str){
        if(str.contains("CREATE_PARKING_LOT")) {
            try {
                String id = str.get(1);
                int numberOfFloors = Integer.parseInt(str.get(2));
                int numberOfSlotsPerFloor = Integer.parseInt(str.get(3));
                return new ParkingLot(id, numberOfFloors, numberOfSlotsPerFloor);
            }catch (Exception e){
                System.out.println("please give id,number of floors and number of slots per floor correctly");
            }
        }
        return null;
    }
    public static void doWork(List<String> str){
        if(str.contains("DISPLAY")){

        }
    }

}
