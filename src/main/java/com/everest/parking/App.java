package com.everest.parking;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.parkinglot.models.enums.SlotType;
import com.everest.parking.vehicle.types.Car;

public class App {
    public static void main(String[] args) {
        ParkingLot p = ParkingLot.createParkingLot("PR1234",2,6);
        p.park(new Car("scdcd","colour"));
//        Slot slot=p.getParkingArea().getSpecificSLotInSpecificFloor(1,3);
//        System.out.println(slot.getVehicleInSlot().getTypeOfVehicle());
//        Slot slot2=new Slot(SlotType.CAR);
//        slot2.parkVehicleInSlot(new Car("EGRWGETH","WHITE"));
//        System.out.println(slot2.getVehicleInSlot().getRegistrationNumber());
//
//        Slot slot3=new Slot(SlotType.CAR);
//        slot3.parkVehicleInSlot(new Car("EGRWGETH","WHITE"));
//        System.out.println(slot3.getVehicleInSlot().getRegistrationNumber());
        System.out.println(p.getParkingArea().getAllFloorsInParkingArea()[0].getSlotsList()[3].getVehicleInSlot().getRegistrationNumber());
    }
}
