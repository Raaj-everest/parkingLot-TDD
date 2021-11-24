//package com.everest.parking.parkinglot.functions;
//
//import com.everest.parking.parkinglot.ParkingLot;
//import com.everest.parking.parkinglot.models.ParkingArea;
//import com.everest.parking.vehicle.Vehicle;
//import com.everest.parking.vehicle.types.Car;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DriverTest {
//
// Driver driver;
// @BeforeEach
//         void Setup() {
//
// }
// @Test
//    void parkTest(){
//  ParkingLot p = ParkingLot.createParkingLot("PR1234", 2, 6);
//     Vehicle v =new Car("sdvrv","white");
//     driver.park(v,p.getParkingArea().getFloors());
//  assertEquals(p.getParkingArea().getFloors()[0].getSlotsList()[2].getVehicleInSlot(),v.getTypeOfVehicle());
// }
//}