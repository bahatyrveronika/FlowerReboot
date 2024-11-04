package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    protected String description = "Unknown Item";
    
    private double price;
    private String name;

    public double price() {
        return this.price;
    }

}
