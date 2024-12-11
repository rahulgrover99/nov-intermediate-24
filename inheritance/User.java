package com.example.splitwise.demo.inheritance;

public class User {
    protected int id;

    int a = 5;

    public User(int id, String name) {
        this.id = id;
    }
    void login() {
        System.out.println("User with ID: " + id + " is logged in.");
    }

    int getId() {
        return this.id;
    }

}
