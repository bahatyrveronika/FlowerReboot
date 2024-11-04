package com.example.demo;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in Basket";
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
