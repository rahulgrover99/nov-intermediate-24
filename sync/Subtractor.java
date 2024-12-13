package com.example.splitwise.demo.sync;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            // Thread -> tries to get a lock, if it doesn't, put it in the waiting queue.
//            System.out.println("Hello subtractor");
//            System.out.println("Subtracting value in subtractor thread.");
            synchronized (counter) {
                counter.i -= 1;
            }

        }
    }
}
