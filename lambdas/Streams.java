package com.example.splitwise.demo.lambdas;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
//        for (Integer i: integerList) {
//            System.out.println(i);
//        }

        Stream<Integer> integerStream = integerList.stream();


//        integerStream.forEach(a -> System.out.println(a + 1));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Print square of each number
        numbers.forEach(x -> System.out.println(x * x));


        // 2. Iterate over it and print every even number.
        numbers.stream().filter(x -> x%2 ==0).forEach( x -> System.out.println(x));

        // 3. return a list of the squares of each number.
        Set<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toSet());

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> lengths = names.stream().map(s -> s.length()).toList();

//        Give a list of strings, find the average length of all the strings.
        names.stream().mapToInt(x -> x.length()).average().getAsDouble();

    }

}
