package com.example.splitwise.demo.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> registry = new HashMap<>();


    public StudentRegistry() {
        Student student = new Student("DEFAULT", "IIT", 0);
        registry.put("default", student);
    }

    void register(String key, Student student) {
        registry.put(key, student);
        System.out.println("Saving key to the registry");
    }

    Student get(String key) {
        return registry.get(key).clone();
    }

}
