package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class TicketTest {
    @Test
    public void theParkingFeeShouldNotEqualToZero(){
        ParkingSpot parkingSpot = new ParkingSpot("F11", VehicleType.COMPACT);
        Ticket ticket = new Ticket(parkingSpot);
        assertNotEquals(0.0, ticket.calculateParkingFee());
    }
}
