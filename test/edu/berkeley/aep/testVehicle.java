package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testVehicle {
    @Test
    public void GettingTheLicensePlate7AAA777OfAVehicleShouldReturnItsLicenseNumber() {
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertEquals("7AAA777", vehicle.getLicensePlate());
    }
}
