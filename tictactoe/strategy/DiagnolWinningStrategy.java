package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Cell;
import com.example.splitwise.demo.tictactoe.models.CellState;
import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.Player;

public class DiagnolWinningStrategy implements WinningStrategy{
    @Override
    public boolean isWinning(Game game) {
        return leftTopToRightBottomCheck(game) || rightTopToLeftBottom(game);
    }

    public boolean leftTopToRightBottomCheck(Game game) {
        Player currPlayer = game.playerList.get(game.currPlayerIndex);

        for (int i = 0; i < game.board.getN(); i++) {
            Cell curr = game.board.getCells().get(i).get(i);
            if (curr.getCellState().equals(CellState.FREE) || !curr.getPlayer().equals(currPlayer)) {
                return false;
            }
        }
        return true;
    }

    public boolean rightTopToLeftBottom(Game game) {
        Player currPlayer = game.playerList.get(game.currPlayerIndex);
        int N = game.board.getN();
        for (int i = 0; i < N; i++) {
            Cell curr = game.board.getCells().get(i).get(N - i - 1);
            if (curr.getCellState().equals(CellState.FREE) || !curr.getPlayer().equals(currPlayer)) {
                return false;
            }
        }
        return true;
    }
}
