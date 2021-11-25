package com.everest.parking.parkinglot;

import com.everest.parking.vehicle.types.Bike;
import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ParkingLotTest {
    ParkingLot p1;

    @BeforeEach
    void SetUp(){
         p1 = ParkingLot.createParkingLot("PR1234", 2, 6);
    }

    @Test
    void singletonCheck() {
        ParkingLot p2 = ParkingLot.createParkingLot("PR3276", 2, 6);
        assertEquals(p1, p2);
    }

    @Test
    void ParkTesting() {

        p1.park(new Car("v1", "colour"));
        p1.park(new Car("v2", "colour"));
        p1.park(new Car("v3", "colour"));
        p1.park(new Car("v4", "colour"));
        p1.park(new Car("v5", "colour"));
        p1.park(new Car("v6", "colour"));
        p1.park(new Truck("v6", "colour"));

        assertEquals(p1.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot().getRegistrationNumber(), "v1");

        assertEquals(p1.getSpecificSLotInSpecificFloor(1,5).getVehicleInSlot().getRegistrationNumber(), "v2");

        assertEquals(p1.getSpecificSLotInSpecificFloor(1,6).getVehicleInSlot().getRegistrationNumber(), "v3");

        assertEquals(p1.getSpecificSLotInSpecificFloor(2,4).getVehicleInSlot().getRegistrationNumber(), "v4");

        assertEquals(p1.getSpecificSLotInSpecificFloor(2,5).getVehicleInSlot().getRegistrationNumber(), "v5");

        assertEquals(p1.getSpecificSLotInSpecificFloor(2,6).getVehicleInSlot().getRegistrationNumber(), "v6");




//        assertNull(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
//        assertNull(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
    }

    @Test
    void UnParkTest(){
        p1.park(new Car("v1", "colour"));
        p1.park(new Truck("v6", "colour"));
        p1.park(new Bike("v6", "colour"));
        p1.park(new Bike("v6", "colour"));
        p1.park(new Bike("v6", "colour"));
        p1.park(new Bike("v6", "colour"));
        p1.unPark(1, 4);
        p1.unPark(1,1);

        assertNull(p1.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
        assertNull(p1.getSpecificSLotInSpecificFloor(1,1).getVehicleInSlot());
    }
}