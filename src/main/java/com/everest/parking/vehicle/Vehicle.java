package com.everest.parking.vehicle;


import com.everest.parking.vehicle.types.enums.VehicleType;

public class Vehicle {
  private final String registrationNumber;
  private final String colour;
  private final String typeOfVehicle;

  public Vehicle (VehicleType type, String registrationNumber, String Colour ){
    this.registrationNumber=registrationNumber;
    this.colour = Colour;
    this.typeOfVehicle=type.toString();
  }
  public String getColourOfVehicle() {
    return colour;
  }
  public String getRegistrationNumber() {
    return registrationNumber;
  }
  public String getTypeOfVehicle() {
    return typeOfVehicle;
  }
}
