package com.example.splitwise.demo.adapter;

import com.example.splitwise.demo.users.User;

public class Main {
    public static void main(String[] args) {

        Phonepe phonepe = new Phonepe(new ICICIBankAdapter());

        phonepe.addUser(new User("abc", "", ""));

    }
}
