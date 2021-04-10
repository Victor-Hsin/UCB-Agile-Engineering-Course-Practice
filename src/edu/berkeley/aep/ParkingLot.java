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
        for (ParkingFloor parkingFloor: parkingFloors) {
            ParkingSpot parkingSpot = parkingFloor.findAvailableParkingSlot(vehicle.getVehicleType());
            if (parkingSpot != null) {
                Ticket ticket = new Ticket(parkingSpot);
                parkingSpot.addVehicle(vehicle);
                return ticket;
            }
        }
        return null;
    }

    public double exitAndCalculateTheParkingFee(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.removeVehicle();
        return 0.0;
    }
}
