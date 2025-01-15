package com.example.splitwise.demo.lsp;

public interface CloudProvider {

    String uploadToBlobstore();

    void createLambda();
}
