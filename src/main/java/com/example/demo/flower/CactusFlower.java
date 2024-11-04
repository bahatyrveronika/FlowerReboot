package com.example.demo.flower;

public class CactusFlower extends Flower {

    public CactusFlower() {
        description = "Cactus Flower";
    }

    @Override
    public double price() {
        return 15.0; // Set a base price for Cactus flower
    }
}
