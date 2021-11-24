package com.everest.parking.parkinglot;

import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import org.junit.jupiter.api.Test;

import static java.util.concurrent.locks.LockSupport.park;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void setUp(){
        ParkingLot p1 = ParkingLot.createParkingLot("PR1234",1,4);
        ParkingLot p2 = ParkingLot.createParkingLot("PR3276",2,6);
        assertEquals(p1, p2);
    }

    @Test
    void ParkTesting(){

        ParkingLot p = ParkingLot.createParkingLot("PR1234",2,6);
        p.park(new Car("scdcd","colour"));
        assertEquals(p.getParkingArea().getAllFloorsInParkingArea()[0].getSlotsList()[3].getVehicleInSlot().getTypeOfVehicle(),"CAR");



    }

}