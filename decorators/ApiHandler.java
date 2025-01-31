package com.example.splitwise.demo.decorators;

import java.net.http.HttpResponse;


// Interface for all api handler
public interface ApiHandler {

    HttpResponse<Integer> call();

}
