package com.example.splitwise.demo.factory;

public class AndroidFlutter extends Flutter{
    @Override
    public UiFactory createUiFactory() {
        return new AndroidUiFactory();
    }
}
