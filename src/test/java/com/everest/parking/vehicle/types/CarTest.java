package com.everest.parking.vehicle.types;

import com.everest.parking.vehicle.types.enums.VehicleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CarTest {

         Car car;

        @BeforeEach
        void setup() {
            car = new Car("WA-KA-WA-KA", "RED");
        }

        @Test
        @DisplayName("Car must be created")
        void carCreated() {
            assertNotNull(car, "car object is created");

        }

        @Test
        @DisplayName("car colour must be matched")
        void carColour() {
            assertEquals(car.getColourOfVehicle(), "RED", "car colour matched");
        }

        @Test
        @DisplayName("car registrationNumber must be matched")
        void carRegistrationNumber() {
            assertEquals(car.getRegistrationNumber(), "WA-KA-WA-KA", "car registration number matched");
        }

        @Test
        @DisplayName("car must be a vehicle type")
         void carTypeTest() {
            assertEquals(car.getTypeOfVehicle(), VehicleType.CAR.toString(), "car is a vehicle type of car");
        }


    }
