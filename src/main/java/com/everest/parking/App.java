package com.everest.parking;

import com.everest.parking.Controller.InputHandler;
import com.everest.parking.Controller.ParkinglotController;
import com.everest.parking.parkinglot.ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ParkingLot parkingLot;

    public static void main(String[] args) {
        boolean exit=false;
        System.out.println("|=====================================================================|");
        System.out.println("|===================      EVEREST PARKING LOT     ====================|");
        System.out.println("|=====================================================================|");
        do {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            ArrayList<String> input = (ArrayList<String>) InputHandler.processInput(str);
            if(input.equals("EXIT")) {
                exit = true;
                System.out.println("you terminated the programme");
                sc.close();
            }else {
                if(parkingLot ==null){
                    parkingLot = ParkinglotController.createParkingLot(input);
                }else {
                    ParkinglotController.operateParkinglot(input, parkingLot);
                }
            }
        } while (!exit);
    }

}
