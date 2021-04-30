package edu.berkeley.aep;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ParkingLotTest {
    static ParkingLot parkingLotA = new ParkingLot("A");
    static ParkingFloor parkingFloor1 = new ParkingFloor("F1", 10, 10, 10);
    static Vehicle largeVehicle = new Vehicle("7AAA777", VehicleType.LARGE);

    static {
        parkingLotA.addAParkingFloor(parkingFloor1);
    }

    @Test
    public void parkAVehicleAtAnParkingLotWithAvailableSpotsShouldReturnATicket() {
        assertNotNull(parkingLotA.provideATicketAndParkTheVehicle(largeVehicle));
    }

    @Test
    public void theParkingFeeShouldNotBeZeroForAnExitingVehicle() {
        Ticket ticket = parkingLotA.provideATicketAndParkTheVehicle(largeVehicle);
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        double parkingFee = parkingLotA.exitAndCalculateTheParkingFee(ticket);
        assertNotEquals(0.0, parkingFee);
    }

//    @Test
//    public void whenAVehicleLeavesTheOriginalParkingSlotShouldBecomeAvailable() {
//        Ticket ticket = parkingLotA.provideATicketAndParkTheVehicle(largeVehicle);
//        ParkingSpot parkingSpot = ticket.getParkingSpot();
//        assertTrue(parkingSpot.isAvailable());
//    }
}
