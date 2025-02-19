package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Board;
import com.example.splitwise.demo.tictactoe.models.Cell;
import com.example.splitwise.demo.tictactoe.models.CellState;
import com.example.splitwise.demo.tictactoe.models.Player;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell suggestMove(Player player, Board board) {
        int N = board.getN();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = board.getCells().get(i).get(j);
                if (cell.getCellState() == CellState.FREE) return cell;
            }
        }
        throw new IllegalStateException("No space on board.");
    }
}
