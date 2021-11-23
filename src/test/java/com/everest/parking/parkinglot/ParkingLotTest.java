package com.everest.parking.parkinglot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingLotTest {

    ParkingLot parkingLot1;

    @BeforeEach
    void setParkingLot1() {
        parkingLot1 = new ParkingLot(2, 6);
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

}