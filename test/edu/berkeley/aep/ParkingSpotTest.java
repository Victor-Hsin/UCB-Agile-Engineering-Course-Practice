package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParkingSpotTest {
    @Test
    public void anEmptyParkingSpotShouldBeAvailable() {
        ParkingSpot newParkingSpot = new ParkingSpot("F1-1", VehicleType.MOTORCYCLE);
        assertEquals(true, newParkingSpot.isAvailable());
    }

    @Test
    public void addALargeVehicleToAmEmptyLargeParkingSpotShouldReturnTrue() {
        Vehicle largeVehicle = new Vehicle("7AAA777", VehicleType.LARGE);
        ParkingSpot largeParkingSlot = new ParkingSpot("F1-1", VehicleType.LARGE);
        assertEquals(true, largeParkingSlot.addVehicle(largeVehicle));
    }

    @Test
    public void removeAParkedVehicleFromAnParkingSpotShouldReturnTrue() {
        Vehicle largeVehicle = new Vehicle("7AAA777", VehicleType.LARGE);
        ParkingSpot largeParkingSlot = new ParkingSpot("F1-1", VehicleType.LARGE);
        largeParkingSlot.addVehicle(largeVehicle);
        assertEquals(true, largeParkingSlot.removeVehicle());
    }
}
