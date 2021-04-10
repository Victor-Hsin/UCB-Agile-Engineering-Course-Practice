package edu.berkeley.aep;

import java.util.ArrayList;

// understands how to find the available parking slots in this floor
public class ParkingFloor {
    private String parkingFloorName;
    private ArrayList<ParkingSpot> motorcycleParkingSpots = new ArrayList<ParkingSpot>();
    private ArrayList<ParkingSpot> compactParkingSpots = new ArrayList<ParkingSpot>();
    private ArrayList<ParkingSpot> largeParkingSpots = new ArrayList<ParkingSpot>();

    public ParkingFloor(String parkingFloorName, int numberOfParkingSpotsForMotorcycle, int numberOfParkingSpotsForCompactVehicle, int numberOfParkingSpotsForLargeVehicle) {
        this.parkingFloorName = parkingFloorName;

        for (int i=0; i<numberOfParkingSpotsForMotorcycle; i++) {
            motorcycleParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(i), VehicleType.MOTORCYCLE));
        }

        for (int i=numberOfParkingSpotsForMotorcycle; i<numberOfParkingSpotsForCompactVehicle; i++) {
            compactParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(i), VehicleType.COMPACT));
        }

        for (int i=numberOfParkingSpotsForCompactVehicle; i<numberOfParkingSpotsForLargeVehicle; i++) {
            largeParkingSpots.add(new ParkingSpot(parkingFloorName + Integer.toString(i), VehicleType.LARGE));
        }
     }

     public ParkingSpot findAvailableParkingSlot(VehicleType vehicleType) {
        ArrayList<ParkingSpot> parkingSpots;
        if (vehicleType == VehicleType.MOTORCYCLE) {
            parkingSpots = motorcycleParkingSpots;
        } else if (vehicleType == VehicleType.COMPACT) {
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
