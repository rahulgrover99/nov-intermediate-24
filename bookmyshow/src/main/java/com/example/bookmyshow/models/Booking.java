package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "booking")
public class Booking extends BaseModel {
    @OneToMany
    private List<ShowSeat> showSeat;

    private double totalAmount;

    @Temporal(TemporalType.TIME)
    private Date bookedAt;

    @ManyToOne
    private Show show;
}