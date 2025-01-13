package com.example.splitwise.demo.srp;

public class CircleAreaFinder implements AreaFinder{
    @Override
    public int calculate(int length) {
        return 3 * length * length;
    }
}
