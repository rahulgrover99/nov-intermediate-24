package com.example.splitwise.demo.prototype;

public class IntelligentStudent extends Student{

    private int achieverScore;

    public IntelligentStudent(String name, String university, double psp, int achieverScore) {
        super(name, university, psp);
        this.achieverScore = achieverScore;
    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.achieverScore = other.achieverScore;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
