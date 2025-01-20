package com.example.splitwise.demo.singleton;

public class EagerLoading {

    private static final EagerLoading INSTANCE = new EagerLoading();

    private EagerLoading() {}

    public static EagerLoading getInstance() {
        return INSTANCE;
    }

}
