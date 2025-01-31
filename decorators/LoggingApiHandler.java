package com.example.splitwise.demo.decorators;

import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.Date;

public class LoggingApiHandler implements ApiHandler{

    ApiHandler apiHandler;

    LoggingApiHandler(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    @Override
    public HttpResponse<Integer> call() {

        // decoration
        System.out.println("Current time of the call is " + Date.from(Instant.now()));

        // call to the basic function
        HttpResponse<Integer> response = apiHandler.call();

        // decoration
        System.out.println(response.uri());
        System.out.println(response.statusCode());

        return response;

    }
}
