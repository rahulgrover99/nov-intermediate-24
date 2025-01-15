package com.example.splitwise.demo.lsp;

public class AwsCloud implements CloudProvider{
    @Override
    public String uploadToBlobstore() {
        System.out.println("Uploading to S3");
        return "https://s3";
    }

    @Override
    public void createLambda() {

    }
}
