package com.example.splitwise.demo.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        // Creates a thread pool that creates new threads as needed,
        // but will reuse previously constructed threads when they are available.
        // These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks.
        // Calls to execute will reuse previously constructed threads if available. If no existing thread is available,
        // a new thread will be created and added to the pool. Threads that have not been used for sixty seconds are terminated
        // and removed from the cache. Thus, a pool that remains idle for long enough will not consume any resources. Note that pools with similar properties but different details (for example, timeout parameters) may be created using ThreadPoolExecutor constructors.
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = List.of(8, 1, 4, 2, 3, 0, 5, 6, 10, 11, 18, 20, 11);
        MergeSorter mergeSorter = new MergeSorter(list, executorService);

        System.out.println(executorService.submit(mergeSorter).get());


    }
}
