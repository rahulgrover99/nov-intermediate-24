package com.example.splitwise.demo.factory;

public class IosFlutter extends Flutter{
    @Override
    public UiFactory createUiFactory() {
        return new IosUiFactory();
    }
}
