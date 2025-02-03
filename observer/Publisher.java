package com.example.splitwise.demo.observer;

public interface Publisher {

    void addSubscriber(Subscriber subscriber);


    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();


}
