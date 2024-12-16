package com.example.splitwise.demo.semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Store store;
    Semaphore cS;
    Semaphore pS;

    public Producer(Store store, Semaphore cS, Semaphore pS) {
        this.store = store;
        this.cS = cS;
        this.pS = pS;
    }

    @Override
    public void run() {
        try {
            pS.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Producer %s Size of queue: %d\n",
                Thread.currentThread().getName(), store.queue.size());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        store.queue.add(new Object());

        cS.release();
    }
}
