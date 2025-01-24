package com.example.splitwise.demo.prototype;

public class Main {
    public static void main(String[] args) {

        Student student = new IntelligentStudent("ABC", "XYZ", 90.0, 100);

        Student copy = student.clone();
        copy.setName("Rahul");

        StudentRegistry studentRegistry = new StudentRegistry();

        Student registryStudent = studentRegistry.get("default");

        registryStudent.setName("Rahul");

        System.out.println(copy);
    }
}
