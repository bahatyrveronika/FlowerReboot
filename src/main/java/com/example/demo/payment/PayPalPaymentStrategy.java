package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public String getPaymentNotification() {
        return "PayPal Payment";
    }
}
