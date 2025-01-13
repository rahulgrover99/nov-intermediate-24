package com.example.splitwise.demo.addersubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Counter counter;
    Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
//        lock.lock();
        for (int i = 0; i < 100000; i++) {
//            System.out.println("Hello adder");
//            lock.lock();
//            System.out.println("Adding value in adder thread");
            counter.i += 1;
//            lock.unlock();
        }
//        lock.unlock();
    }
}
