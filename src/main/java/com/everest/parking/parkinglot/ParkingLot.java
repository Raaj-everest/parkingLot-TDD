package com.everest.parking.parkinglot;

import com.everest.parking.parkinglot.models.Floor;
import com.everest.parking.parkinglot.models.ParkingArea;
import com.everest.parking.parkinglot.models.Slot;
import com.everest.parking.vehicle.Vehicle;

public class ParkingLot {
    public static ParkingLot parkingLotInstance = null;
    private final ParkingArea parkingArea;
    private final String id;

    private ParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor) {
        parkingArea = new ParkingArea(numberOfFloors, numberOfSlotsPerFloor);
        this.id = id;
    }

    public static ParkingLot createParkingLot(String parkingLotId, int numberOfFloors, int numberOfSlotsPerFloor) {
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot(parkingLotId, numberOfFloors, numberOfSlotsPerFloor);
        }
        return parkingLotInstance;
    }


    public String getId() {
        return id;
    }

    public void park(Vehicle vehicle) {
        Floor[] floor = parkingArea.getAllFloorsInParkingArea();
          for(int i =0;i< floor.length;i++){
            Slot[] slot= floor[i].getSlotsList();
             for(int j=0;j<slot.length;j++){
                 slot[j].parkVehicleInSlot(vehicle);
                 if(slot[j].getIsOccupied()){
                     return ;
                 }
             }
          }
    }
     private void getSlotsInAllFloors(Slot[] slot,Vehicle vehicle){
         for(int j=0;j<slot.length;j++){
             slot[j].parkVehicleInSlot(vehicle);
             if(slot[j].getIsOccupied()){
                 return ;
             }
         }
     }
    public ParkingArea getParkingArea() {
        return parkingArea;
    }
}
