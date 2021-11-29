package com.everest.parking;

import com.everest.parking.InputHandler.InputHandler;
import com.everest.parking.parkinglot.ParkingLot;

import java.util.List;
import java.util.Scanner;

public class App {
    public static ParkingLot system;

    public static void main(String[] args) {
        boolean exit=false;
        do {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            List<String> newStr = InputHandler.input(str);
            if(newStr.contains("EXIT")){
                exit=true;
                System.out.println("you terminated the programme");
                sc.close();
            }else{

            }
        } while (!exit);
    }
}
