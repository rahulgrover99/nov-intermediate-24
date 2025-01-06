package com.example.splitwise.demo.exceptions;

public class Division {
    int a;
    int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int execute() {
        int x = a/b;
        System.out.println("Division run");
        return x;
    }
}
