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
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
        return true;
    }

    public boolean removeVehicle() {
        if (!this.isOccupied) {
            return false;
        }
        this.isOccupied = false;
        this.parkedVehicle = null;
        return true;
    }
}
