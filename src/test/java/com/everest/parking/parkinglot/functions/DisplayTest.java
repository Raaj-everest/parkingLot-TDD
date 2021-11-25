package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {

    ParkingLot p=ParkingLot.createParkingLot("PR1234",2,6);

    @BeforeEach
    void setup(){

    }

    @Test
    void freeCountTest(){
        p.park(new Car("WA-KA","RED"));
        assertEquals(Display.freeCount(p, VehicleType.CAR),0);
    }

    @Test
    void freeSlotTest(){
        Display.freeSlots(p,VehicleType.CAR);

    }
    @Test
    void occupiedSlotTest(){
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Truck("WEGRG","RED"));
        Display.occupiedSlots(p,VehicleType.CAR);
        Display.occupiedSlots(p,VehicleType.TRUCK);

    }

}