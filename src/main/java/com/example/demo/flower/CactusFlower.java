package com.example.demo.flower;

public class CactusFlower extends Flower {

    // public CactusFlower() {
    //     description = "Cactus Flower";
    // }

    public CactusFlower(double sepalLength, FlowerColor color) {
        super(sepalLength, color, 15.0, FlowerType.CACTUS);
        this.description = "Cactus Flower";
    }

    @Override
    public double price() {
        return 15.0;
    }
}
