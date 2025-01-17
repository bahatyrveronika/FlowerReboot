package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/orders")
    public List<Order> listFlowers() {
        return List.of(
                new Order(
                        List.of(new Flower(10.0, FlowerColor.BLUE, 10.0, FlowerType.ROSE)),
                        new DHLDeliveryStrategy(),
                        new CreditCardPaymentStrategy()
                ),
                new Order(
                        List.of(new Flower(10.0, FlowerColor.BLUE, 10.0, FlowerType.ROSE)),
                        new PostDeliveryStrategy(),
                        new PayPalPaymentStrategy()
                )
        );
    }
}
