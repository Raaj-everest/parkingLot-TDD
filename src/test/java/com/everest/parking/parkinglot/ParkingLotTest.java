package com.everest.parking.parkinglot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingLotTest {

ParkingLot parkingLot1;

    @BeforeEach
    void setParkingLot1() {
        parkingLot1 = ParkingLot.createParkingLot("PR1234",2,6);
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
        parkingLot1= parkingLot1.createParkingLot("PR1234",2,6);
        String string1 = parkingLot1.getId();
        String string2 = "PR1234";
        assertEquals(string1,string2);

    }

}