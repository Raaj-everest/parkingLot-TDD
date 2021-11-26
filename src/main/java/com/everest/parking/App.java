package com.everest.parking;

import com.everest.parking.InputHandler.InputHandler;
import com.everest.parking.parkinglot.ParkingLot;

import java.util.Scanner;

public class App<i> {
    public static ParkingLot system;

    public static void main(String[] args) {
        boolean exit=false;
        do {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] newStr = InputHandler.input(str);
            if(newStr[0].equals("EXIT")){
                exit=true;
            }else{

            }
        } while (!exit);
    }
}
