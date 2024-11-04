package com.example.demo.flower;

import com.example.demo.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    protected String description = "Flower";
    @Id
    @SequenceGenerator(
            name = "flower_sequence",
            sequenceName = "flower_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
    private long Id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(double sepalLength, FlowerColor color, double price, FlowerType type) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = type;
    }

    public Flower(Flower flower) {
        flowerType = flower.flowerType;
        sepalLength = flower.sepalLength;
        price = flower.price;
        color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean match(Flower f) {
        return this.price == f.getPrice() && this.flowerType.equals(f.getFlowerType())
                && this.getSepalLength() == f.getSepalLength();
    }
}
