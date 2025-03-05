package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hall_seats")
public class Seat extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    @Column(name = "hall_row")
    private int row;

    @Column(name = "hall_col")
    private int col;

    @Enumerated
    private SeatType seatType;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}