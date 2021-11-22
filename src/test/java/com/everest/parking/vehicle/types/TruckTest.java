package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    Truck truck;

    @BeforeEach
    void setup(){
        truck = new Truck("WA-KA-WA-KA","BROWN");
    }

    @Test
    @DisplayName("Truck must be created")
    void truckCreated() {
        assertNotNull(truck, "Truck object is created and not NULL");

    }

    @Test
    @DisplayName("Truck colour must be matched")
    void truckColour() {
        assertEquals(truck.getColourOfVehicle(), "BROWN", "Truck colour matched");
    }

    @Test
    @DisplayName("Truck registrationNumber must be matched")
    void truckRegistrationNumber() {
        assertEquals(truck.getRegistrationNumber(), "WA-KA-WA-KA", "Truck registration number matched");
    }

    @Test
    @DisplayName("Truck must be a vehicle type")
    void truckTypeTest() {
        assertEquals(truck.getTypeOfVehicle(), VehicleType.TRUCK.toString(), "Truck is a vehicle type");
    }

}