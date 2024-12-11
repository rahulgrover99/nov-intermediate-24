package com.example.splitwise.demo.concurrency;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("I am here in Runnable.");
        System.out.println(Thread.currentThread().getName());
    }
}
