package com.example.splitwise.demo.decorators;

import java.net.http.HttpResponse;
import java.util.Random;

public class AuthApiHandler implements ApiHandler{

    ApiHandler apiHandler;

    public AuthApiHandler(ApiHandler apiHandler) {
        this.apiHandler =apiHandler;
    }

    @Override
    public HttpResponse<Integer> call() {

        System.out.println("Check if the user is authorized");


        int random = new Random().nextInt() % 4;

        if (random == 0) throw new IllegalArgumentException("Not Authorized");

        return apiHandler.call();
    }
}
