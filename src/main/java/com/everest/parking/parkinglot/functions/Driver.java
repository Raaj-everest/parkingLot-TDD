package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.ParkingLot;
import com.everest.parking.parkinglot.models.Floor;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Driver {

    public void park(Vehicle vehicle,Floor[] floor) {
        for(int i=0;i<floor.length;i++){
            Slot[] slots =floor[i].getSlotsList();
            for(int j=0; j<slots.length;j++){
                slots[i].parkVehicleInSlot(vehicle);
            }
        }
    }

    public void unPark(VehicleType typeOfVehicle, String registrationNumber, String colour) {

    }

}


