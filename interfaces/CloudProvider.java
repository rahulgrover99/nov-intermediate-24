package com.example.splitwise.demo.interfaces;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

interface CloudProvider {


    // Ny default the methods in an interface are Public and Abstract (no implementation)
    void uploadBytes(byte[] bytes);
    void createInstance();

    default void runLambda() {
        System.out.println("Running lambda");

    }
}
