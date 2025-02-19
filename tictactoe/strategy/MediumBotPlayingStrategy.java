package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Board;
import com.example.splitwise.demo.tictactoe.models.Cell;
import com.example.splitwise.demo.tictactoe.models.CellState;
import com.example.splitwise.demo.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell suggestMove(Player player, Board board) {
        int n = board.getN();
        List<Cell> availableCells = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board.getCells().get(i).get(j).getCellState().equals(CellState.FREE)) {
                    availableCells.add(board.getCells().get(i).get(j));
                }
            }
        }
        int x = Math.abs(RandomGenerator.getDefault().nextInt()) % availableCells.size();
        return availableCells.get(x);
    }


}
