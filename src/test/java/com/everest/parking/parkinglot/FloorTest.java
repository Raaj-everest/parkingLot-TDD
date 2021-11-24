package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.Floor;
import com.everest.parking.parkinglot.models.enums.SlotType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FloorTest {

    Floor floor;

//    @Test
//    void addSlotsTest(){
//        floor = new Floor(6);
//        floor.addSlotsToFloor(2);
//        assertEquals(floor.getSlotsList().length,8,"slots should be added");
//    }
    @BeforeEach
    void setup(){
        floor = new Floor(6);
    }
    @Test
    void arrangeSlotsTest(){
        assertEquals(floor.getSlotsList()[0].getSlotType(), SlotType.TRUCK.toString());
        assertEquals(floor.getSlotsList()[1].getSlotType(), SlotType.BIKE.toString());
        assertEquals(floor.getSlotsList()[3].getSlotType(), SlotType.CAR.toString());
    }


}