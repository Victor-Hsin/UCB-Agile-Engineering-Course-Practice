package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void theLicensePlate7AAA777OfAVehicleShouldEqualTo7AAA777() {
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertEquals("7AAA777", vehicle.getLicensePlate());
    }

    @Test
    public void theVehicleTypeOfACompactVehicleShouldEqualToCompact() {
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertEquals(true, vehicle.vehicleTypeEquals(VehicleType.COMPACT));
    }
}
