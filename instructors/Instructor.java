package com.example.splitwise.demo.instructors;

import com.example.splitwise.demo.users.User;

public class Instructor {

    final String name;
    final Batch batch;

    public Instructor(String name, Batch batch) {
        this.name = name;
        this.batch = batch;
    }

    // Shallow copy constructor
    public Instructor(Instructor other) {
        this.name = other.name;
        this.batch = new Batch(other.batch);
    }

    public void changeBatchName() {
//        Cannot assign a value to final variable 'batch'
        // not valid
//        this.batch = new Batch("CKKCK");

        // valid
        this.batch.name = "aBC";
    }



}
