package com.example.splitwise.demo.adapter;

import com.example.splitwise.demo.adapter.sdk.ICICIBank;
import com.example.splitwise.demo.users.User;

public class ICICIBankAdapter implements BankingService {


    ICICIBank iciciBank = new ICICIBank();



    public void registerUser(User user) {

        String name = user.name;

        iciciBank.register(name, "123");

    }


}
