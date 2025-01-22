package com.example.splitwise.demo.builder;

public class Helper {
    private String name;
    private Long id;
    private String batch;
    private Double psp;
    private String university;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getBatch() {
        return batch;
    }

    public Double getPsp() {
        return psp;
    }

    public String getUniversity() {
        return university;
    }

    public Helper setName(String name) {
        this.name = name;
        return this;
    }

    public Helper setId(Long id) {
        this.id = id;
        return this;
    }

    public Helper setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Helper setPsp(Double psp) {
        this.psp = psp;
        return this;
    }

    public Helper setUniversity(String university) {
        this.university = university;
        return this;
    }
}
