package com.everest.parking;

import com.everest.parking.InputHandler.InputHandler;
import com.everest.parking.parkinglot.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static ParkingLot system;

    public static void main(String[] args) {
        boolean exit=false;
        System.out.println("|=====================================================================|");
        System.out.println("|===================      EVEREST PARKING LOT     ====================|");
        System.out.println("|=====================================================================|");
        do {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            ArrayList<String> newStr = (ArrayList<String>) InputHandler.input(str);
            if(newStr.contains("EXIT")) {
                exit = true;
                System.out.println("you terminated the programme");
                sc.close();
            }else {
                if(system==null){
                    system=InputHandler.createParkingLot(newStr);
                }else {
                    InputHandler.doWork(newStr, system);
                }
            }
        } while (!exit);
    }
}
