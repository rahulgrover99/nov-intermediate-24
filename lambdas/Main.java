package com.example.splitwise.demo.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        Runnable runnable = new HelloWorldPrinter();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

        Interface2 interface2 = new Interface2() {
            @Override
            public void walk() {

            }

            @Override
            public void run() {

            }
        };



        // Anonymous class object -> the class has no name.
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world in anonymous" + Thread.currentThread().getName());
            }
        });

        t2.start();



        // () -> implementation
        // () -> { implementation }
        Thread t3 = new Thread(() -> System.out.println("Hello world"));
        Thread t4 = new Thread(() -> {
            System.out.println("hellow");
            System.out.println("bbye");
        });

//        int a  =5;
        NumberPrinter numberPrinter = (a) -> System.out.println(a + 1);
        numberPrinter.printNumber(5);

        Consumer<Integer> c = (a) -> System.out.println(a + 10);
        c.accept(5);


        Function<Integer, String> fn = (a) -> {
            System.out.println("sasaas");
            return a.toString();
        };

        String s = fn.apply(888);
        System.out.println(s);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);


        Supplier<String> helloWorldSupplier = () -> "Hello World";
        System.out.println(helloWorldSupplier.get());

        List<Integer> integers = List.of(1, 2, 3);

        integers.forEach(a -> {
            if (a%2 == 1) {
                System.out.println(a);
            }
        });

        integers.forEach(a -> System.out.println(a));
//        integers.forEach(a -> System.out.println(a));

    }
}