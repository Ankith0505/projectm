package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testQuantityUpdate() {

        App.addProduct("Monitor", 5);

        App.updateQuantity("Monitor", 12);

        int quantity = App.getQuantity("Monitor");

        assertEquals(12, quantity);
    }

    @Test
    public void testProductNotFound() {

        int quantity = App.getQuantity("Unknown");

        assertEquals(-1, quantity);
    }
}
