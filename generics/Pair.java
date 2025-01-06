package com.example.splitwise.demo.generics;

public class Pair <FIRST extends Number, S> {

    static <X, Y> void doSomething(X first) {
//        FIRST first1; -- cannot be referred from a static context.

//        System.out.println(first.intValue() + s.intValue());
        System.out.println(first instanceof Integer);
    }

    private FIRST first;
    S second;

    public Pair(FIRST first, S second) {
        this.first = first;
        this.second = second;
    }

    FIRST getFirst() {
        System.out.println(first.intValue() + 1);
//        System.out.println(first + 1);
        return first;
    }


}
