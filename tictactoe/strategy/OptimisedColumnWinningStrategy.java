package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.Player;

import java.util.HashMap;
import java.util.Map;

public class OptimisedColumnWinningStrategy implements WinningStrategy{
    private Map<Integer, Map<Player, Integer> > cache;

    public OptimisedColumnWinningStrategy() {
        this.cache = new HashMap<>();
    }

    @Override
    public boolean isWinning(Game game) {
        // cache[col][currPlayer] == N
        return false;
    }
}
