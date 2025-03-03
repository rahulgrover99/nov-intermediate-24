package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "movie_show")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Hall hall;

    @Temporal(TemporalType.TIME)
    private Date startTime;
}
