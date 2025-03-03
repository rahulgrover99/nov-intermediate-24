package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Hall extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;


}
