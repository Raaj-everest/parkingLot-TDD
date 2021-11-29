package com.everest.parking.InputHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputHandler {
    public static List<String> input(String str){
        str = str.toUpperCase();
        str = str.trim();
        String[] newStr = str.split("\\s+");
        ArrayList<String> list = (ArrayList<String>) Arrays.asList(newStr);
        return list;
    }
    public static void doWork(List<String> str){
        if(str.contains("CREATE_PARKING_LOT")){

        }
    }
}
