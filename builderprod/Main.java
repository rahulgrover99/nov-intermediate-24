package com.example.splitwise.demo.builderprod;


public class Main {


    public static void main(String[] args) {

        // Student class should be responsible for providing its own builder
        // Creating a builder object

//        Student.Builder helper = Student.newBuilder();

//        Student.Builder helper = new Student.Builder();
//        helper.setId(1L);
//        helper.setName("ABC");
//        helper.setUniversity("IIT");
//        helper.setPsp(90.0);


        // Builder responsibility should be to build the Student object.
        // Don't interact with the constructor directly.
//        Student student = new Student(helper);

//        Student student = helper.build();



        Student student = Student.newBuilder()
                .setId(1L)
                        .setName("ABC")
                                .setPsp(90.0)
                                        .setUniversity("IIT").build();


//        student.setName();


        student.changeBatch("XYZ");

    }
}
