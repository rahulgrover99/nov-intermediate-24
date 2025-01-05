package com.example.splitwise.demo.lambdas;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world");
    }
}
