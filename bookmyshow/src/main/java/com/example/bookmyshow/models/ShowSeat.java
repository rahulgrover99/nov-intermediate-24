package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Show show;

    private int price;

    private ShowSeatStatus showSeatStatus;
}
