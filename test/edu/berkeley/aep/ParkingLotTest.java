package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ParkingLotTest {
    static ParkingLot parkingLotA = new ParkingLot("A");
    static ParkingFloor parkingFloor1 = new ParkingFloor("F1", 10, 10, 10);
    static Vehicle largeVehicle = new Vehicle("7AAA777", VehicleType.LARGE);

    static {
        parkingLotA.addAParkingFloor(parkingFloor1);
    }

    @Test
    public void provideATicketAndParkTheVehicle() {
        assertNotNull(parkingLotA.provideATicketAndParkTheVehicle(largeVehicle));
    }
}
