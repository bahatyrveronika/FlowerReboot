package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.payment.Payment;

public class PaymentTest {

    @Test
    public void testCreditCardPaymentNotification() {
        Payment payment = new CreditCardPaymentStrategy();
        assertEquals("CreditCard Payment", payment.getPaymentNotification());
    }

    @Test
    public void testPayPalPaymentNotification() {
        Payment payment = new PayPalPaymentStrategy();
        assertEquals("PayPal Payment", payment.getPaymentNotification());
    }
}
