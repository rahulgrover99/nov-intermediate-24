package com.example.splitwise.demo.instructors;

public class Main {

    public static void main(String[] args) {

        Batch advBatch = new Batch("Advance");

        Instructor instructor = new Instructor("Rahul", advBatch);

        Instructor copy = new Instructor(instructor);

        System.out.println(instructor.batch.name);
        System.out.println(copy.batch.name);

        instructor.batch.name = "Int";

        System.out.println(instructor.batch.name);
        System.out.println(copy.batch.name);




    }
}
