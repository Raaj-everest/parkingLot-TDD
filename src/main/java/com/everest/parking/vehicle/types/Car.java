package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.Vehicle;
import com.everest.parking.vehicle.types.enums.VehicleType;

public class Car implements Vehicle {
  private final String registrationNumber;
  private final String colour;
  private final String typeOfVehicle = VehicleType.CAR.toString();

  public Car(String registrationNumber, String colour) {
    this.registrationNumber = registrationNumber;
    this.colour = colour;
  }

  public String getRegistrationNumber() {
    return this.registrationNumber;
  }

  public String getTypeOfVehicle() {
    return this.typeOfVehicle;
  }

  public String getColourOfVehicle() {
    return this.colour;
  }
}
