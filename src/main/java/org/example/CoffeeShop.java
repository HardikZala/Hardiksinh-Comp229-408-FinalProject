package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoffeeShop {
    public static void main(String[] args) {
        // change the constants if needed
        final int numberOfCashiers = 2;
        final int numberOfMachines = 4;
        final int threadCount = 10;
        // add extra fields if needed

        ExecutorService executorService =
                Executors.newFixedThreadPool(threadCount);


        for(int i=0; i<numberOfMachines;i++){
            // change name to random name generated using faker
            // add extra fields to constructor if needed
            executorService.submit(new CoffeeMachine("Random name"));
        }

        for(int i=0; i<numberOfCashiers;i++) {
            // change name to random name generated using faker
            // add extra fields to constructor if needed
            executorService.submit(new Cashier("Random name"));
        }

    }
}