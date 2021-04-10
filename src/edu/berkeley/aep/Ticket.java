package edu.berkeley.aep;

// understands the vehicle's parking information
public class Ticket {
    private ParkingSpot parkingSpot;
    private long startTime;

    public Ticket(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
        this.startTime = System.currentTimeMillis();
    }
}
