package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String getPaymentNotification() {
        return "CreditCard Payment";
    }
}

