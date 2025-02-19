package com.example.splitwise.demo.tictactoe.controllers;

import com.example.splitwise.demo.tictactoe.models.Board;
import com.example.splitwise.demo.tictactoe.models.Cell;
import com.example.splitwise.demo.tictactoe.models.CellState;
import com.example.splitwise.demo.tictactoe.models.Player;

public class BoardController {
    Board board;
    int N;

    public BoardController(Board board) {
        this.board = board;
        this.N = board.getN();
    }

    public void displayBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = board.getCells().get(i).get(j);
                if (cell.getCellState() == CellState.OCCUPIED) {
                    System.out.printf("| %c ", cell.getPlayer().getSymbol());
                } else {
                    System.out.printf("|   ");
                }
            }
            System.out.printf("|\n");
        }
    }

    public void updateBoard(Cell cell, Player player) {
        int row = cell.getRow();
        int col = cell.getCol();

        if (row < N && col < N && row >=0 && col >= 0 && this.board.getCells().get(row).get(col).getCellState() == CellState.FREE) {
            this.board.getCells().get(row).get(col).updateCell(player);
        } else {
            throw new IllegalArgumentException("The move is invalid");
        }
    }

    public boolean isFull() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = board.getCells().get(i).get(j);
                if (cell.getCellState() == CellState.FREE) return false;
            }
        }
        return false;
    }
}
