package edu.berkeley.aep;

// understands the vehicle's parking information and parking fee
public class Ticket {
    private ParkingSpot parkingSpot;
    private long startTime;
    private double parkingRatePerSec = 0.001;

    public Ticket(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
        this.startTime = System.currentTimeMillis();
    }

    public double calculateParkingFee() {
        return 0;
    }
}
