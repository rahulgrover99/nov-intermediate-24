package com.example.splitwise.demo.instructors;

import com.example.splitwise.demo.inheritance.User;

public class Mentor extends User {
    public Mentor(int id, String name) {
        super(id, name);
    }

    void printMentorId() {
        System.out.println(this.id);
    }
}
