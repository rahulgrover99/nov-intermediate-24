package com.example.splitwise.demo.lsp;

public class Main {
    public static void main(String[] args) {

        CloudProvider cloudProvider = new LocalStorage();

        String url = cloudProvider.uploadToBlobstore();
        System.out.println(url);
        // Make a call at this url to fetch the file.
//        byte[] fileBytes = requests.call(url);

    }
}
