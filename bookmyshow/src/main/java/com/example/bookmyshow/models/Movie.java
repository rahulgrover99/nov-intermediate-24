package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    @Column(unique = true)
    private String name;

    private int duration;
}