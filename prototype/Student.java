package com.example.splitwise.demo.prototype;

public class Student implements Prototype<Student>{

    private String name;
    private String university;
    private double psp;

    public Student(String name, String university, double psp) {
        this.name = name;
        this.university = university;
        this.psp = psp;
    }

    public Student(Student other) {
        this.name = other.name;
        this.psp = other.psp;
        this.university = other.university;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }
}
