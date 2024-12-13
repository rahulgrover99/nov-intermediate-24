package com.example.splitwise.demo.syncmethods;

public class Counter {
    private int i = 0;
    synchronized void increment() {
        i += 1;
    }

    synchronized void decrement() {
        i -= 1;
    }

    int getValue() {
        return i;
    }



}
