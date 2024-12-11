package com.example.splitwise.demo.mergesort;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private final List<Integer> unsortedArray;
    private final ExecutorService executorService;

    public MergeSorter(List<Integer> unsortedArray, ExecutorService executorService) {
        this.unsortedArray = unsortedArray;
        this.executorService = executorService;
    }


    public List<Integer> sort() throws ExecutionException, InterruptedException {
        // 1. Find mid, and break the array into 2 parts
        // 2. Sort the 2 parts individually.
        // 3. Merge the sorted arrays together.

        System.out.printf("Sorting %s on thread %s\n", unsortedArray, Thread.currentThread().getName());

        if (unsortedArray.size() <= 1) {
            return unsortedArray;
        }

        // 1. ----------
        int n = unsortedArray.size();

        int mid = n/2;

        List<Integer> leftUnsorted = new ArrayList<>();
        List<Integer> rightUnsorted = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftUnsorted.add(unsortedArray.get(i));
        }

        for (int i = mid; i < n; i++) {
            rightUnsorted.add(unsortedArray.get(i));
        }

        // 2. ---------------
        Future<List<Integer>> leftSortedFuture = executorService.submit(new MergeSorter(leftUnsorted, executorService));
        Future<List<Integer>> rightSortedFuture = executorService.submit(new MergeSorter(rightUnsorted, executorService));

        // 3. ------------------


        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSorted = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();
        int i = 0, j = 0;
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                sortedArray.add(leftSorted.get(i));
                i+=1;
            } else {
                sortedArray.add(rightSorted.get(j));
                j+=1;
            }
        }
        while (i < leftSorted.size()) {
            sortedArray.add(leftSorted.get(i));
            i++;
        }
        while ((j < rightSorted.size())) {
            sortedArray.add(rightSorted.get(j));
            j++;
        }

        return sortedArray;

    }

    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }
}
