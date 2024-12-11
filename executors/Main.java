package com.example.splitwise.demo.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }

        executorService.shutdown();

        List<Future<Integer>> sums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Addition addition = new Addition(i, i + 1);
            Future<Integer> sum = executorService.submit(addition);
            sums.add(sum);
        }

        for (int i = 0; i < 100; i++) {
            // get() call blocks the main thread until the future has got back the real value.
            // Waits if necessary for the computation to complete,
            // and then retrieves its result.

//            Future(1, 1 + 1)

            System.out.println(sums.get(i).get());
        }
        executorService.shutdown();

    }
}
