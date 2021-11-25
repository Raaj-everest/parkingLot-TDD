package com.everest.parking.parkinglot;

import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ParkingLotTest {

    @Test
    void setUp() {
        ParkingLot p1 = ParkingLot.createParkingLot("PR1234", 1, 4);
        ParkingLot p2 = ParkingLot.createParkingLot("PR3276", 2, 6);
        assertEquals(p1, p2);
    }

    @Test
    void ParkTesting() {

        ParkingLot p = ParkingLot.createParkingLot("PR1234", 2, 6);
        p.park(new Car("v1", "colour"));
        p.park(new Car("v2", "colour"));
        p.park(new Car("v3", "colour"));
        p.park(new Car("v4", "colour"));
        p.park(new Car("v5", "colour"));
        p.park(new Car("v6", "colour"));
        p.park(new Truck("v6", "colour"));

        assertEquals(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot().getRegistrationNumber(), "v1");

        assertEquals(p.getSpecificSLotInSpecificFloor(1,5).getVehicleInSlot().getRegistrationNumber(), "v2");

        assertEquals(p.getSpecificSLotInSpecificFloor(1,6).getVehicleInSlot().getRegistrationNumber(), "v3");

        assertEquals(p.getSpecificSLotInSpecificFloor(2,4).getVehicleInSlot().getRegistrationNumber(), "v4");

        assertEquals(p.getSpecificSLotInSpecificFloor(2,5).getVehicleInSlot().getRegistrationNumber(), "v5");

        assertEquals(p.getSpecificSLotInSpecificFloor(2,6).getVehicleInSlot().getRegistrationNumber(), "v6");

        p.unPark(1, 4);
        p.unPark(2,4);

        assertNull(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
        assertNull(p.getSpecificSLotInSpecificFloor(2,4).getVehicleInSlot());
//        assertNull(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
//        assertNull(p.getSpecificSLotInSpecificFloor(1,4).getVehicleInSlot());
    }
}