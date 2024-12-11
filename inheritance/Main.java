package com.example.splitwise.demo.inheritance;

import com.example.splitwise.demo.instructors.Mentor;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(1, "rahul");


        instructor.login();

        User user = new User(1, "");

        user.login();


        System.out.println(instructor);

        User uuuuuu = new Instructor(2, "runtime");

        uuuuuu.login();

        System.out.println(uuuuuu);

        System.out.println(user.a);
        System.out.println(instructor.a);
        System.out.println(uuuuuu.a);

        // What about constructors?
//        -- What is constructor chaining? In what order the constructors are called?
        // How can we pass on attributes to parent classes.
        // What about access modifiers?
        // What abut multiple and multilevel inheritance?

    }
}
