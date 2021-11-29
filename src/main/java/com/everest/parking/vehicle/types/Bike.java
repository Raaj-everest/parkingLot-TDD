package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Bike extends Vehicle {

  public Bike(String registrationNumber, String colour) {
    super(VehicleType.BIKE,registrationNumber,colour);

  }

}
