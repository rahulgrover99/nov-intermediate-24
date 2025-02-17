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


    public void displayBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = cells.get(i).get(j);
                if (cell.cellState == CellState.OCCUPIED) {
                    System.out.printf("| %c ", cell.player.symbol);
                } else {
                    System.out.printf("|   ");
                }
            }
            System.out.printf("|\n");
        }
    }

    public void updateBoard(Cell cell, Player player) {
        int row = cell.row;
        int col = cell.col;

        if (row < N && col < N && row >=0 && col >= 0 && this.cells.get(row).get(col).cellState == CellState.FREE) {
            this.cells.get(row).get(col).updateCell(player);
        } else {
            throw new IllegalArgumentException("The move is invalid");
        }
    }

    public boolean isFull() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = cells.get(i).get(j);
                if (cell.cellState == CellState.FREE) return false;
            }
        }
        return false;
    }
}
