package com.example.splitwise.demo.builder;

public class Student {
    private String name;
    private Long id;
    private String batch;
    private Double psp;
    private String university;

    public Student(Helper helper) {
        // All validations
        if (helper.getId() == null) {
            throw new IllegalStateException("ID is 0");
        }
        if (helper.getName() == null) {
            throw new RuntimeException();
        }


        // setting of the values
        this.id = helper.getId();
        this.batch = helper.getBatch();
        this.name = helper.getName();
        this.psp = helper.getPsp();
        this.university = helper.getUniversity();
    }

    // no public setters


    public void changeBatch(String batch) {
        System.out.println("old batch: " + this.batch);
        this.batch = batch;
        System.out.println("new batch: " + this.batch);
    }
}
