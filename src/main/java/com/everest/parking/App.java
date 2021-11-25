package com.everest.parking;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.functions.Ticket;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.parkinglot.models.enums.SlotType;
import com.everest.parking.vehicle.types.Car;

public class App<i> {
    public static void main(String[] args) {
        ParkingLot p = ParkingLot.createParkingLot("PR1234",2,6);
        p.park(new Car("scdcd","colour"));
        System.out.println(p.getAllFloorsInParkingArea()[0].getSlotsList()[3].getVehicleInSlot().getRegistrationNumber());

        for(int i=0;i<100;i++){
            Ticket.print(i,p);
        }
    }
}
