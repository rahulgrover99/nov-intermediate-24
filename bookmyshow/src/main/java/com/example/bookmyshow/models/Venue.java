package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Venue extends BaseModel{

    private String name;
    private String city;

    @OneToMany(mappedBy = "venue")
    private List<Hall> halls;

}
