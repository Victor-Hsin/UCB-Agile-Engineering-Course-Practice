package edu.berkeley.aep;

import org.junit.Test;

public class TicketTest {
    @Test
    public double theParkingFeeShouldNotEqualToZero(){
        ParkingSpot parkingSpot = new ParkingSpot("F11", VehicleType.COMPACT);
        Ticket ticket = new Ticket(parkingSpot);
        return ticket.calculateParkingFee();
    }
}
