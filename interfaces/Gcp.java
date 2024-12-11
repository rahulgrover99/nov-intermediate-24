package com.example.splitwise.demo.interfaces;

public class Gcp implements CloudProvider{
    @Override
    public void uploadBytes(byte[] bytes) {
        System.out.println("uploading bytes to cloud bucket.");
    }

    @Override
    public void createInstance() {
        System.out.println("GCP Instance created.");
    }

    public void runLambda() {
        System.out.println("Running gcp lambda");
    }
}
