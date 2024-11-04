package com.example.demo.flower;

public class RomashkaFlower extends Flower {

    public RomashkaFlower() {
        description = "Romashka Flower";
    }

    @Override
    public double price() {
        return 10.0; // Set a base price for Romashka (daisy) flower
    }
}
