package com.example.splitwise.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Pair<Integer, Integer> pair = new Pair<>(2, 1);
        System.out.println(pair.getFirst());

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();


        List<Number> numbers = new ArrayList<>(List.of(1, 2));

        printNumbers(numbers);
        printNumbers(integerList);


//        Pair<String, String>
        Pair.<Integer, Integer>doSomething(9);

    }

    static <T extends Number> void printNumbers(List<T> numbers) {
        numbers.forEach(x -> System.out.println(x.intValue()));
    }
}
