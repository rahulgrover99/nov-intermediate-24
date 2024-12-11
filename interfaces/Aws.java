package com.example.splitwise.demo.interfaces;

public class Aws implements CloudProvider{
    @Override
    public void uploadBytes(byte[] bytes) {
        System.out.println("Uploading bytes to S3.");
    }

    @Override
    public void createInstance() {
        System.out.println("Creating AWS VM Instance");
    }
}
