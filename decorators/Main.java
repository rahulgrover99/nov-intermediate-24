package com.example.splitwise.demo.decorators;

import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<ApiHandler> apiHandlers = List.of(
                new AuthApiHandler(new LoggingApiHandler(new InstructorApiHandler())),
                new AuthApiHandler(new LoggingApiHandler(new StudentApiHandler())));


        apiHandlers.stream().forEach(apiHandler -> apiHandler.call());


    }
}
