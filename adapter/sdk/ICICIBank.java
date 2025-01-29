package com.example.splitwise.demo.adapter.sdk;

// 3p code.
// Can't make changes here.
public class ICICIBank {
    public void register(String name, String aadhaar) {
        System.out.println("Registered with ICICI");
    }

    boolean pay(double amount, String acc) {
        System.out.println("Paid to account");
        return true;
    }
}
