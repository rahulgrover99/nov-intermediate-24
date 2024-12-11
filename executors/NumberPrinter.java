package com.example.splitwise.demo.executors;

public class NumberPrinter implements Runnable{
    private final int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Printing number " + i + " on thread " + Thread.currentThread().getName());
    }
}

