package com.example.splitwise.demo.syncmethods;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Counter {
    private AtomicInteger i = new AtomicInteger(0);
    void increment() {
        i.incrementAndGet();
    }

    void decrement() {
        i.decrementAndGet();
    }

    int getValue() {
        return i.get();
    }



}
