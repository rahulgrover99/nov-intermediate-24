package com.example.splitwise.demo.concurrency;

public class Printing100Numbers {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            System.out.println(Thread.currentThread().getName());
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
            System.out.println("Hello World"); // main thread
        }

    }

    // T1 - 2ms
    // T2 - 1ms
    // T1 - 2ms

}
