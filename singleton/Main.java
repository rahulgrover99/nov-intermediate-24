package com.example.splitwise.demo.singleton;

public class Main {
    public static void main(String[] args) {

        LazyLoading l1 = LazyLoading.getInstance();

        LazyLoading l2 = LazyLoading.getInstance();

        System.out.println(l1.toString() + l2.toString());

        new Client().fun();

        EagerLoading e1 = EagerLoading.getInstance();

        EagerLoading e2 = EagerLoading.getInstance();

        System.out.println(e1.toString() + e2.toString());

    }
}
