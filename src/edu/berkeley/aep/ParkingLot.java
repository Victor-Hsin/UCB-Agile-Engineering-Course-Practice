package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

// understands how vehicle and driver interact with parking lot.
public class ParkingLot {
    private String parkingLotName;
    private List<ParkingFloor> parkingFloors = new ArrayList<ParkingFloor>();

    public ParkingLot(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public void addAParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloors.add(parkingFloor);
    }

    public Ticket provideATicketAndParkTheVehicle(Vehicle vehicle) {
        return null;
    }
}
