package com.example.splitwise.demo.interfaces;

public class Main {
    public static void main(String[] args) {

        CloudProvider cloudProvider = new Gcp();

        cloudProvider.createInstance();
        cloudProvider.runLambda();





    }


    private static void runLambda(CloudProvider cloudProvider) {
        cloudProvider.runLambda();
    }

}
