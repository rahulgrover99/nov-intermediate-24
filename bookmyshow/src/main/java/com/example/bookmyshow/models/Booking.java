package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@Table(name = "booking")
@AllArgsConstructor
public class Booking extends BaseModel {
    @OneToMany
    private List<ShowSeat> showSeat;

    private double totalAmount;

    @Temporal(TemporalType.TIME)
    private Date bookedAt;

    @ManyToOne
    private Show show;
}