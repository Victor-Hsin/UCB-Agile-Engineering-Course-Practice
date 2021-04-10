package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingFloorTest {
    @Test
    public void findACompactParkingSlotInAnParkingFloorWithAvailableSlotShouldNotReturnNull(){
        ParkingFloor parkingFloor = new ParkingFloor("F1", 10, 10, 10);
        assertNotNull(parkingFloor.findAvailableParkingSlot(VehicleType.COMPACT));
    }
}
