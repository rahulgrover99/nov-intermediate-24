package com.example.splitwise.demo.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {
    int N;

    List<List<Cell>> cells = new ArrayList<>();

    public Board(int n) {
        if (n < 3) throw new IllegalArgumentException("Board size should be greater than 3");

        N = n;

        for (int i = 0; i < N; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                row.add(new Cell(i, j));
            }
            cells.add(row);
        }
    }
}
