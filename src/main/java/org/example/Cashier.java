package org.example;

import java.util.UUID;

public class Cashier implements Runnable {

    private final String cashierName;


    // add more fields if needed

    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    @Override
    public void run() {
        placeOrder();
    }

    private void placeOrder() {
        // Generate a random order at a certain interval.
        // You can use faker library to generate name of the customer
        // You can use Math.Random to switch between different type of coffees


        // Print the order details to the console after submission
        // example Thread-2 cashierName: Order id abc (Latte) is accepted for John
    }
}
