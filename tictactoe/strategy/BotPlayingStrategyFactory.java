package com.example.splitwise.demo.tictactoe.strategy;

import com.example.splitwise.demo.tictactoe.models.BotDifficultyLevel;
import com.example.splitwise.demo.tictactoe.strategy.BotPlayingStrategy;
import com.example.splitwise.demo.tictactoe.strategy.EasyBotPlayingStrategy;
import com.example.splitwise.demo.tictactoe.strategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel){
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            default -> new MediumBotPlayingStrategy();
        };
    }
}
