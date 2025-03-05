package com.example.bookmyshow.dtos;

import com.example.bookmyshow.models.ShowSeat;
import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;


@Data
public class SeatMap {
    List<Pair<Integer, Integer>> seats = new ArrayList<>();

    public SeatMap(List<ShowSeat>showSeats) {
        for (ShowSeat showSeat: showSeats) {
            seats.add(Pair.of(showSeat.getSeat().getRow(), showSeat.getSeat().getCol()));
        }
    }
}
