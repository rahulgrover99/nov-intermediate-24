package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Game;

public interface WinningStrategy {
    boolean isWinning(Game game);
}
