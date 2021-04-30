package edu.berkeley.aep;

// Understands a vehicle's properties
public class Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public boolean vehicleTypeEquals(VehicleType vehicleType) {
        if (vehicleType == this.vehicleType) {
            return true;
        }
        return false;
    }
}
