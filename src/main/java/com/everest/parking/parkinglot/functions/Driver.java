package com.everest.parking.parkinglot.functions;

import com.everest.parking.parkinglot.models.Floor;
import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Driver {

    public void park(VehicleType typeOfVehicle, ParkingArea parkingArea) {
        Floor[] floor = parkingArea.getFloors();
        for(int i=0;i<floor.length;i++){
            floor[i].getSlotsList();
        }
    }

    public void unPark(VehicleType typeOfVehicle, String registrationNumber, String colour) {

    }

}


