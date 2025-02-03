package com.example.splitwise.demo.observer;

public class InventoryOrderSubscriber implements Subscriber{
    @Override
    public void onOrderPlace(OrderDetails orderDetails) {
        System.out.println("Updated inventory for order");
    }
}
