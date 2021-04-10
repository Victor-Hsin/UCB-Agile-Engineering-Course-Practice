package edu.berkeley.aep;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotEquals;

public class TicketTest {
    @Test
    public void theParkingFeeShouldNotEqualToZero(){
        ParkingSpot parkingSpot = new ParkingSpot("F11", VehicleType.COMPACT);
        Ticket ticket = new Ticket(parkingSpot);
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        assertNotEquals(0.0, ticket.calculateParkingFee());
    }
}
