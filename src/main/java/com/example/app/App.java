package com.example.app;

import java.util.ArrayList;

public class App {

    static ArrayList<String> products = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();

    public static void main(String[] args) {

        addProduct("Laptop", 10);
        addProduct("Mouse", 25);
        addProduct("Keyboard", 15);

        displayInventory();

        updateQuantity("Mouse", 30);

        System.out.println("\nAfter Update:");
        displayInventory();
    }

    public static void addProduct(String product, int quantity) {

        products.add(product);
        quantities.add(quantity);

        System.out.println(product + " added successfully");
    }

    public static void updateQuantity(String product, int newQuantity) {

        int index = products.indexOf(product);

        if (index != -1) {
            quantities.set(index, newQuantity);
            System.out.println(product + " quantity updated");
        } else {
            System.out.println(product + " not found");
        }
    }

    public static int getQuantity(String product) {

        int index = products.indexOf(product);

        if (index != -1) {
            return quantities.get(index);
        }

        return -1;
    }

    public static void displayInventory() {

        System.out.println("\nInventory Details:");

        for (int i = 0; i < products.size(); i++) {

            System.out.println(
                "Product: " + products.get(i)
                + " | Quantity: " + quantities.get(i)
            );
        }
    }
}
