package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class CarTest {

    Car car;

    @Test
    @DisplayName("Car must be created")
    void carCreated() {
        car = new Car("WA-KA-WA-KA", "RED");
        assertNotNull(car, "car object is created");
        assertEquals(car.getColourOfVehicle(), "RED", "car colour matched");
        assertEquals(car.getRegistrationNumber(), "WA-KA-WA-KA", "car registration number matched");
        assertEquals(car.getTypeOfVehicle(), VehicleType.CAR.toString(), "car is a vehicle type of car");
    }


}
