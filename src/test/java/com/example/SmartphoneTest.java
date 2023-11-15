package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {
    @Test
    public void testSmartphoneInitialization() {
        Smartphone phone = new Smartphone("Galaxy", "S20", 50);
        assertEquals("Galaxy", phone.getBrand());
        assertEquals("S20", phone.getModel());
        assertEquals(50, phone.getBatteryLevel());
    }

    @Test
    public void testBatteryCheck() {
        // Test with low battery level
        Smartphone lowBatteryPhone = new Smartphone("Galaxy", "S20", 10);
        String lowBatteryMessage = lowBatteryPhone.checkBattery();
        assertEquals("Warning: Battery low!", lowBatteryMessage);

        // Test with sufficient battery level
        Smartphone sufficientBatteryPhone = new Smartphone("Galaxy", "S20", 60);
        String sufficientBatteryMessage = sufficientBatteryPhone.checkBattery();
        assertEquals("Battery level is okay: 60%", sufficientBatteryMessage);
    }
}
