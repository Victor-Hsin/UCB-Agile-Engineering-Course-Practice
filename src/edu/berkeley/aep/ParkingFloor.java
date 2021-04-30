package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

// understands how to find the available parking slots in this floor
public class ParkingFloor {
    private String parkingFloorName;
    private List<ParkingSpot> motorcycleParkingSpots = new ArrayList<ParkingSpot>();
    private List<ParkingSpot> compactParkingSpots = new ArrayList<ParkingSpot>();
    private List<ParkingSpot> largeParkingSpots = new ArrayList<ParkingSpot>();

    public ParkingFloor(String parkingFloorName, int numberOfMotorcycleParkingSpots, int numberOfCompactParkingSpots, int numberOfLargeParkingSpots) {
        this.parkingFloorName = parkingFloorName;
        int parkingLotCount = 0;

        for (int i=0; i<numberOfMotorcycleParkingSpots; i++) {
            parkingLotCount += 1;
            motorcycleParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(parkingLotCount), VehicleType.MOTORCYCLE));
        }
        for (int i=0; i<numberOfCompactParkingSpots; i++) {
            parkingLotCount += 1;
            compactParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(parkingLotCount), VehicleType.COMPACT));
        }
        for (int i=0; i<numberOfLargeParkingSpots; i++) {
            parkingLotCount += 1;
            largeParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(parkingLotCount), VehicleType.LARGE));
        }
     }

    public ParkingSpot findAvailableParkingSlot(Vehicle vehicle) {
        List<ParkingSpot> parkingSpots;
        if (vehicle.vehicleTypeEquals(VehicleType.MOTORCYCLE)) {
            parkingSpots = motorcycleParkingSpots;
        } else if (vehicle.vehicleTypeEquals(VehicleType.COMPACT)) {
            parkingSpots = compactParkingSpots;
        } else {
            parkingSpots = largeParkingSpots;
        }

        for (ParkingSpot parkingSpot: parkingSpots) {
            if (parkingSpot.isAvailable()) {
                return parkingSpot;
            }
        }
        return null;
    }
}
