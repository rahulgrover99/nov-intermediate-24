package com.example.splitwise.demo.singleton;

public class ThreadSafeLazyLoading {
    private static ThreadSafeLazyLoading instance = null;


    private ThreadSafeLazyLoading() {}

    public static ThreadSafeLazyLoading getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoading.class) {
                // this is double check locking.

                if (instance == null) {
                    instance = new ThreadSafeLazyLoading();
                }
            }
        }
        // 99% of calls are fast, and multiple threads can process without
        // getting a lock.
        return instance;
    }

}
