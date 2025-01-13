package com.example.splitwise.demo.srp;

public class Main {
    public static void main(String[] args) {

        new AreaCalculator().calculate("circle", 1);

        AreaFinder areaFinder = new CircleAreaFinder();
        System.out.println(areaFinder.calculate(1));

    }
}
