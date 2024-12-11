package com.example.splitwise.demo.executors;

import java.util.concurrent.Callable;

public class Addition implements Callable<Integer> {

    int a;
    int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.printf("Summing a %d + b %d %s\n", a, b, Thread.currentThread().getName());
        return a + b;
    }
}
