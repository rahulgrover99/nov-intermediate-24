package com.example.splitwise.demo.semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {

    Queue<Object> queue;

    public Store() {
        // Thread safe version of queue.
        this.queue = new ConcurrentLinkedQueue<>();
    }
}
