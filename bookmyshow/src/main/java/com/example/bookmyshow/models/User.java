package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    String email;
    String password;

    @PrePersist
    public void onCreate() {
        System.out.println("Entity created.");
    }
}
