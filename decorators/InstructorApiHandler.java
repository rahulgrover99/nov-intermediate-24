package com.example.splitwise.demo.decorators;

import javax.net.ssl.SSLSession;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class InstructorApiHandler implements ApiHandler{
    @Override
    public HttpResponse<Integer> call() {
        return new HttpResponse<Integer>() {
            @Override
            public int statusCode() {
                return 201;
            }

            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public Optional<HttpResponse<Integer>> previousResponse() {
                return Optional.empty();
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public Integer body() {
                return null;
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return URI.create("/instructors");
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }
        };
    }
}
