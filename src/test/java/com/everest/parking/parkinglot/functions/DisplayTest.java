package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.vehicle.types.Car;
import com.everest.parking.vehicle.types.Truck;
import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.everest.parking.parkinglot.functions.Display.*;

class DisplayTest {

    ParkingLot p= ParkingLot.createParkingLot("PR1234",2,6);

    @BeforeEach
    void setup(){

    }

    @Test
    void freeCountTest(){
        p.park(new Car("WA-KA","RED"));
        p.park(new Truck("WA-KA","RED"));
        p.getDisplay().freeCount( VehicleType.CAR);
        p.getDisplay().freeCount(VehicleType.TRUCK);
    }

    @Test
    void freeSlotTest(){
        p.getDisplay().freeSlots(VehicleType.CAR);

    }
    @Test
    void occupiedSlotTest(){
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Car("Raaj","white"));
        p.park(new Truck("WEGRG","RED"));
        p.getDisplay().occupiedSlots(p,VehicleType.CAR);
        p.getDisplay().occupiedSlots(p,VehicleType.TRUCK);

    }

}