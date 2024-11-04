package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerBucket;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;

public class DecoratorTest {

    @Test
    public void testFlowerBucketWithPaperAndRibbon() {
        Item item = new FlowerBucket();
        item = new PaperDecorator(item);
        item = new RibbonDecorator(item);

        assertEquals("Flower Bucket, Paper Wrapped, with Ribbon", item.getDescription());
        assertEquals(53.0, item.price());
    }

    @Test
    public void testFlowerWithBasket() {
        Item item = new Flower(0.0, FlowerColor.BLUE, 10.0, FlowerType.CHAMOMILE);
        item = new BasketDecorator(item);

        // assertEquals("Flower, in Basket", item.getDescription());
        assertEquals(4.0, item.price());
    }

    @Test
    public void testRomashkaFlowerWithAllDecorators() {
        Item item = new Flower(0.0, FlowerColor.BLUE, 10.0, FlowerType.CHAMOMILE);
        item = new PaperDecorator(item);
        item = new BasketDecorator(item);
        item = new RibbonDecorator(item);
        // assertEquals("Flower, Paper Wrapped, in Basket, with Ribbon", item.getDescription());
        assertEquals(57.0, item.price());
    }
}
