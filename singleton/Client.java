package com.example.splitwise.demo.singleton;

public class Client {

  public void fun() {

        LazyLoading lazyLoading = LazyLoading.getInstance();
      System.out.println(lazyLoading.toString());
    }
}
