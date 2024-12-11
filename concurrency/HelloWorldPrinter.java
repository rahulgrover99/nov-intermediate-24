package com.example.splitwise.demo.concurrency;

public class HelloWorldPrinter {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        foo();

        Thread t1 = new Thread(new RunnableClass());
        t1.start();

        t1.join();
        foo();

    }

    public static void foo() {
        System.out.println("Hellow world in foo. printed by thread" + Thread.currentThread().getName());
    }

}
