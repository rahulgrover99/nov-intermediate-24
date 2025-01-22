package com.example.splitwise.demo.builder;

public class Main {


    public static void main(String[] args) {

        Helper helper = new Helper();

        helper.setId(1L);
        helper.setName("ABC");
        helper.setUniversity("IIT");
        helper.setPsp(90.0);


        Student student = new Student(helper);
        student.changeBatch("XYZ");

        helper.setPsp(80.0);



//        student.setName();


//        Student st = Student.newBuilder().setName().setId().build()

    }
}
