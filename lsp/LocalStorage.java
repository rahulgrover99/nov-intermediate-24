package com.example.splitwise.demo.lsp;

public class LocalStorage implements CloudProvider{
    @Override
    public String uploadToBlobstore() {
        System.out.println("Uploading to locla file system");
        return "c://personal/blob/";
    }

    @Override
    public void createLambda() {

    }
}
