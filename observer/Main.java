package com.example.splitwise.demo.observer;

import java.util.List;

public class Main {


    public static void main(String[] args) {


        Amazon amazon = new Amazon();
        amazon.addSubscriber(new AnalyticsOrderSubscriber());

        amazon.placeOrder(1);

        amazon.addSubscriber(new InventoryOrderSubscriber());
        amazon.placeOrder(2);

    }
}
