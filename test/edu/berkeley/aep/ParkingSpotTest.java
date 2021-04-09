package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParkingSpotTest {
    @Test
    public void anEmptyParkingSpotShouldBeAvailable() {
        ParkingSpot newParkingSpot = new ParkingSpot("F1-1", VehicleType.MOTORCYCLE);
        assertEquals(true, newParkingSpot.isAvailable());
    }
}
