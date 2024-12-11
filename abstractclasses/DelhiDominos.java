package com.example.splitwise.demo.abstractclasses;

public class DelhiDominos extends Dominos{
    public DelhiDominos(int deliveryPartners, String city) {
        super(deliveryPartners, city);
    }

    @Override
    void kneadDough() {
        System.out.println("Delhites like cheese burst.");
    }
}
