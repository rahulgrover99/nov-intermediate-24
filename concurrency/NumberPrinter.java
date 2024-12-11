package com.example.splitwise.demo.concurrency;

public class NumberPrinter implements Runnable{

    private final int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i + " Printed by thread " + Thread.currentThread().getName());
        // Thread - i
    }
}
