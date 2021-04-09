package edu.berkeley.aep;

// understands the properties and status of the parking spot.
public class ParkingSpot {
    private String parkingSpotId;
    private VehicleType parkingSpotType;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(String parkingSpotId, VehicleType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.isOccupied = false;
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean addVehicle(Vehicle vehicle) {
        return false;
    }
}
