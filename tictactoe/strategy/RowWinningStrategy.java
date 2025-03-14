package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Cell;
import com.example.splitwise.demo.tictactoe.models.CellState;
import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.Player;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean isWinning(Game game) {
        Player currPlayer = game.playerList.get(game.currPlayerIndex);
        Cell cell = game.moves.get(game.moves.size() - 1);
        int row = cell.getRow();

        for (int i = 0; i < game.board.getN(); i++) {
            Cell curr = game.board.getCells().get(row).get(i);
            if (curr.getCellState().equals(CellState.FREE) || !curr.getPlayer().equals(currPlayer)) {
                return false;
            }
        }
        return true;
    }
}
