package com.example.splitwise.demo.tictactoe.models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, Character symbol, int id) {
        super(name, symbol, id);
    }

    @Override
    public Cell makeMove(Board board, Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your next move?");
        int row = sc.nextInt();
        int col = sc.nextInt();

        return new Cell(row, col);

    }
}
