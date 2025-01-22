package com.example.splitwise.demo.builderprod;

public class Student {
    private String name;
    private Long id;
    private String batch;
    private Double psp;
    private String university;

    private Student(Builder builder) {
        // validations can go here.

        this.id = builder.id;
        this.batch = builder.batch;
        this.name = builder.name;
        this.psp = builder.psp;
        this.university = builder.university;
    }

    void changeBatch(String batch) {
        System.out.println("old batch: " + this.batch);
        this.batch = batch;
        System.out.println("new batch: " + this.batch);
    }

    // Student class provides a static method to get a builder for
    // its creation.
    public static Builder newBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private Long id;
        private String batch;
        private Double psp;
        private String university;

        private Builder() {}

        public Student build() {
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }
    }


}
