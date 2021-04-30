package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void theVehicleTypeOfACompactVehicleShouldEqualToCompact() {
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.COMPACT);
        assertEquals(true, vehicle.vehicleTypeEquals(VehicleType.COMPACT));
    }

    @Test
    public void theVehicleTypeOfALargeVehicleShouldEqualToLarge() {
        Vehicle vehicle = new Vehicle("7AAA777", VehicleType.LARGE);
        assertEquals(true, vehicle.vehicleTypeEquals(VehicleType.LARGE));
    }
}
