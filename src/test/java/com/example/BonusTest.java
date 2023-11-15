package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusTest {
    @Test
    public void testElectronicDeviceGetDeviceInfo() {
        ElectronicDevice device = new ElectronicDevice("Sony", "Xperia");
        String deviceInfo = device.getDeviceInfo();
        assertEquals("Brand: Sony, Model: Xperia", deviceInfo, "getDeviceInfo should return the correct information");
    }

    @Test
    public void testSmartphoneGetSmartphoneDetails() {
        Smartphone phone = new Smartphone("Galaxy", "S20", 50);
        String phoneDetails = phone.getSmartphoneDetails();
        assertEquals("Brand: Galaxy, Model: S20, Battery Level: 50%", phoneDetails, "getSmartphoneDetails should return the correct information");
    }
}
