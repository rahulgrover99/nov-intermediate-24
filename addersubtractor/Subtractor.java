package com.example.splitwise.demo.addersubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Counter counter;
    Lock lock;

    public Subtractor(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            // Thread -> tries to get a lock, if it doesn't, put it in the waiting queue.
//            System.out.println("Hello subtractor");
            lock.lock();
//            System.out.println("Subtracting value in subtractor thread.");
            counter.i -= 1;
            lock.unlock();
        }
    }
}
