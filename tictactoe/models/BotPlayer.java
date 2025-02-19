package com.example.splitwise.demo.tictactoe.models;

import com.example.splitwise.demo.tictactoe.strategy.BotPlayingStrategyFactory;
import com.example.splitwise.demo.tictactoe.strategy.BotPlayingStrategy;

public class BotPlayer extends Player{
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Character symbol, int id, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, id);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    @Override
    public Cell makeMove(Board board, Player player) {
        return botPlayingStrategy.suggestMove(player, board);
    }
}
