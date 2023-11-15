package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectronicDeviceTest {
    @Test
    public void testElectronicDeviceInitialization() {
        ElectronicDevice device = new ElectronicDevice("Sony", "Xperia");
        assertEquals("Sony", device.getBrand());
        assertEquals("Xperia", device.getModel());
    }
}
