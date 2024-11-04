package com.example.demo.flower;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Item;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;
    protected String description = "Flower Bucket";

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public String getDescription() {
        return this.description;
    }
}
