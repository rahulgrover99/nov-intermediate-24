package com.example.splitwise.demo.abstractclasses;

public abstract class Dominos {

    int deliveryPartners;
    String city;

    public Dominos(int deliveryPartners, String city) {
        this.deliveryPartners = deliveryPartners;
        this.city = city;
    }

    void acceptOrder() {
        System.out.println("Sending message to the user.");
        System.out.println("Arranging delivery partner");
        kneadDough();
    }

    abstract void kneadDough();

}
