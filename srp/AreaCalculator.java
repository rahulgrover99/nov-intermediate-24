package com.example.splitwise.demo.srp;

public class AreaCalculator {

    // Grow huge to every type of shape that exists
    // Calculate area for any shape/
    void calculate(String type, int length) {
        if (type == "circle") {
            System.out.println(3.14 * length * length);
        } else if (type == "square") {
            System.out.println(length * length);
        }
    }
}
