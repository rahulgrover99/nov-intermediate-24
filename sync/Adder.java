package com.example.splitwise.demo.sync;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
//        lock.lock();
        for (int i = 0; i < 100000; i++) {
//            System.out.println("Hello adder");
            synchronized (counter) {
                counter.i += 1;
            }
//            System.out.println("Adding value in adder thread");

        }
//        lock.unlock();
    }
}
