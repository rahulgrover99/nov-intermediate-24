package com.example.splitwise.demo.lsp;

public class GcpCloud implements CloudProvider{
    @Override
    public String uploadToBlobstore() {
        System.out.println("Uplading to blobstore");
        return "https://blob";
    }

    @Override
    public void createLambda() {

    }
}
