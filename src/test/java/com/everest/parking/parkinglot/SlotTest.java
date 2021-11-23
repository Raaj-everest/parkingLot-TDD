package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.types.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotTest {

    Slot slot;

    @BeforeEach
    void setSlot(){
        slot = new Slot(new Car("WA-KA-WA-KA","RED"));
    }

    @Test
    void getIsOccupiedTest(){
        assertTrue(slot.getIsOccupied(),"Slot isOccupied must be true");
    }

    @Test
    void removeVehicleInSlotTest(){
        slot.removeVehicleInSlot();
        assertFalse(slot.getIsOccupied(),"the slot must be free");
        assertNull(slot.getVehicleInSlot());
    }




}