package com.example.splitwise.demo.instructors;

public class Batch {
    String name;

    public Batch(String name) {
        this.name = name;
    }

    public Batch(Batch other) {
        this.name = other.name;
    }
}
