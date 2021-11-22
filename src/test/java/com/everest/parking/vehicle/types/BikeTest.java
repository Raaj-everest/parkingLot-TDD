package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.types.enums.VehicleType;
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
    void bikeCreated() {
        assertNotNull(bike, "bike object is created");

    }

    @Test
    @DisplayName("Bike colour must be matched")
    void bikeColour() {
        assertEquals(bike.getColourOfVehicle(), "RED", "bike colour matched");
    }

    @Test
    @DisplayName("Bike registrationNumber must be matched")
    void bikeRegistrationNumber() {
        assertEquals(bike.getRegistrationNumber(), "WA-KA-WA-KA", "bike registration number matched");
    }

    @Test
    @DisplayName("Bike must be a vehicle type")
    void bikeTypeTest() {
        assertEquals(bike.getTypeOfVehicle(), VehicleType.BIKE.toString(), "bike is a vehicle type");
    }


}