package com.example.splitwise.demo.tictactoe.models;

public class BotPlayer extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(String name, Character symbol, int id, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, id);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public void makeMove() {

    }
}
