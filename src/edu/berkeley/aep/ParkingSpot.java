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
        return !this.isOccupied;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (this.isOccupied || this.parkingSpotType != vehicle.getVehicleType()) {
            return false;
        }
        parkedVehicle = vehicle;
        isOccupied = true;
        return true;
    }

    public boolean removeVehicle() {
        return false;
    }
}
