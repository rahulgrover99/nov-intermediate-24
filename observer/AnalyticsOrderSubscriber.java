package com.example.splitwise.demo.observer;

public class AnalyticsOrderSubscriber implements Subscriber{
    @Override
    public void onOrderPlace(OrderDetails orderDetails) {
        System.out.println("Called analytics service.");
    }
}
