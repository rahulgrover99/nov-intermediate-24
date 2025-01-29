package com.example.splitwise.demo.adapter;

import com.example.splitwise.demo.adapter.sdk.ICICIBank;
import com.example.splitwise.demo.users.User;

public class Phonepe {

    // Not owned by us
//    ICICIBank iciciBank;

    BankingService bankAdapter;

    public Phonepe(BankingService bankAdapter) {
        this.bankAdapter = bankAdapter;
    }

    void addUser(User user) {
        // Add user to phonepe DB.
        // Send an email.

        // call ICICI bank and register user
        bankAdapter.registerUser(user);

    }

}
