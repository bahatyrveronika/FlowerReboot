package com.example.demo.flower;

public class RomashkaFlower extends Flower {

    // public RomashkaFlower() {
    //     description = "Romashka Flower";
    // }

    public RomashkaFlower(double sepalLength, FlowerColor color) {
        super(sepalLength, color, 10.0, FlowerType.ROMASHKA);
        description = "Romashka Flower";
    }

    @Override
    public double price() {
        return 10.0;
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
