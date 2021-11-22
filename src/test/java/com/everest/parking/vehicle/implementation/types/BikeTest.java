package com.everest.parking.vehicle.implementation.types;

import com.everest.parking.vehicle.implementation.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bike;

    @BeforeEach
    void setup() {
        bike = new Bike("WA-KA-WA-KA", "RED");
    }

    @Test
    @DisplayName("Bike must be created")
    void BikeCreated() {
        assertNotNull(bike, "bike object is created");

    }

    @Test
    @DisplayName("Bike colour must be matched")
    void BikeColour() {
        assertEquals(bike.getColourOfVehicle(), "RED", "bike colour matched");
    }

    @Test
    @DisplayName("Bike registrationNumber must be matched")
    void BikeRegistrationNumber() {
        assertEquals(bike.getRegistrationNumber(), "WA-KA-WA-KA", "bike registration number matched");
    }

    @Test
    @DisplayName("Bike must be a vehicle type")
    void BikeTypeTest() {
        assertEquals(bike.getTypeOfVehicle(), VehicleType.BIKE.toString(), "bike is a vehicle type");
    }


}