package com.example.splitwise.demo.semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore cS;
    Semaphore pS;

    public Consumer(Store store, Semaphore cS, Semaphore pS) {
        this.store = store;
        this.cS = cS;
        this.pS = pS;
    }

    @Override
    public void run() {
        try {
            cS.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Consumer %s Size of queue: %d\n",
                Thread.currentThread().getName(), store.queue.size());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        store.queue.poll();
        // Signal that I consumed one item, producers can come in.
        pS.release();

    }
}
