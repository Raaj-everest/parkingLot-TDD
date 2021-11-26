package com.everest.parking.InputHandler;

public class InputHandler {
    public static String[] input(String str){
        str = str.toUpperCase();
        str = str.trim();
        String[] newStr = str.split("\\s+");
       return newStr;
    }
}
