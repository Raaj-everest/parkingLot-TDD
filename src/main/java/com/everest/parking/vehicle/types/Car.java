package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Car extends Vehicle {

  public Car(String registrationNumber, String colour) {
    super(VehicleType.CAR, registrationNumber, colour);
  }
}
