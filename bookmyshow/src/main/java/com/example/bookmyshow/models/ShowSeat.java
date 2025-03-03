package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Seat seat;

    private int price;

    private ShowSeatStatus showSeatStatus;
}
