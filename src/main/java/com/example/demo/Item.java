package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    public abstract double getPrice();
    protected String description = "Unknown Item";

    private double price;
    private String name;

    public double price() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

}
