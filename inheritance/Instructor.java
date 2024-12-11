package com.example.splitwise.demo.inheritance;

public class Instructor extends User {
     String batchName;


     Instructor(int id, String name) {
         super(id, name);
     }

     void takeSession() {
         System.out.println("Session going on.");
     }

     void login() {
         System.out.println("Instructor special login.");
     }

}
