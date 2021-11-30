package com.everest.parking.Controller;

import java.util.ArrayList;
import java.util.Collections;

public class InputHandler {

    public static ArrayList<String> processInput(String str) {
        str = str.toUpperCase();
        str = str.trim();
        String[] newStr = str.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, newStr);
        return list;
    }

}
