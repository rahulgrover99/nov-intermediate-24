package com.example.splitwise.demo;

import com.example.splitwise.demo.instructors.Instructor;
import com.example.splitwise.demo.users.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Rahul", "123", "admin");

//        Instructor ins = new Instructor();
//        ins.printNameOfUser(user);

        User copyUser = new User(user);

        System.out.println(copyUser);

    }

}
