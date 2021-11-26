package com.everest.parking.parkinglot.services;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisplayTest {

    ParkingLot p= ParkingLot.createParkingLot("PR1234",2,6);

    @BeforeEach
    void setup(){

    }

    @Test
    void freeCountTest(){
        p.park(new Car("WA-KA","RED"));
        p.park(new Truck("WA-KA","RED"));
        p.display( DisplayType.FREE_COUNT,VehicleType.CAR);
        p.display(DisplayType.FREE_SLOTS,VehicleType.TRUCK);
    }

    @Test
    void freeSlotTest(){
        p.display(DisplayType.FREE_SLOTS,VehicleType.CAR);
    }
    @Test
    void occupiedSlotTest(){
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Truck("WEGRG","RED"));
        p.display(DisplayType.OCCUPIED_SLOTS,VehicleType.CAR);
        p.display(DisplayType.OCCUPIED_SLOTS,VehicleType.TRUCK);

    }

}