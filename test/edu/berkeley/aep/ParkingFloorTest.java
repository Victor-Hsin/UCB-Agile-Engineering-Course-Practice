package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingFloorTest {
    @Test
    public void findACompactParkingSlotInAnParkingFloorWithAvailableSlotShouldNotReturnNull(){
        ParkingFloor parkingFloor = new ParkingFloor("F1", 10, 10, 10);
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertNotNull(parkingFloor.findAvailableParkingSlot(vehicle));
    }

    @Test
    public void findACompactParkingSlotInAnParkingFloorWithNoAvailableSlotShouldReturnNull(){
        ParkingFloor parkingFloor = new ParkingFloor("F1", 0, 0, 0);
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertEquals(null, parkingFloor.findAvailableParkingSlot(vehicle));
    }
}
