package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.ParkingArea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingAreaTest {

ParkingArea parkingLot1;

    @BeforeEach
    void setParkingLot1() {
        parkingLot1 = new ParkingArea("PR1234",2,6);
    }

    @Test
    void getFloorTest(){
        assertEquals(parkingLot1.getFloors().length,2,"number of floors should match");
    }

    @Test
    void numberOfSlotsTest(){
        assertEquals(parkingLot1.getFloors()[0].getSlotsList().length,
                6,
                "number of slots in a floor should match");
    }

    @Test
    void parkingIdTest(){
        String string1 = parkingLot1.getId();
        String string2 = "PR1234";
        assertEquals(string1,string2);

    }

}