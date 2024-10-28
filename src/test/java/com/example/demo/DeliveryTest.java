package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.delivery.PostDeliveryStrategy;

public class DeliveryTest {

    @Test
    public void testDHLDeliveryNotification() {
        Delivery delivery = new DHLDeliveryStrategy();
        assertEquals("Delivery with DHL", delivery.getDeliveryNotification());
    }

    @Test
    public void testPostDeliveryNotification() {
        Delivery delivery = new PostDeliveryStrategy();
        assertEquals("Delivery with simple Post", delivery.getDeliveryNotification());
    }
}
