package com.example.splitwise.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Publisher{

    List<Subscriber> subscriberList = new ArrayList<>();
    OrderDetails orderDetails = new OrderDetails();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber: subscriberList) {
            subscriber.onOrderPlace(orderDetails);
        }
    }

    public void placeOrder(int id) {
        orderDetails.id = id;
        notifySubscribers();
    }
}
