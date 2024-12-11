package com.example.splitwise.demo.users;

public class StudentHelper {



    public String getEmailOfUser(User user) {
        System.out.println(user.email);
        System.out.println(user.name);
        // password' has private access in 'com.example.splitwise.demo.users.User'
//        System.out.println(user.password);
        return user.email;
    }
}
