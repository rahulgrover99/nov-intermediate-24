package com.example.splitwise.demo.tictactoe.controllers;

import com.example.splitwise.demo.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public static Game initialiseGame() {
        System.out.println("Enter the board size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            playerList.add(getPlayerInfoFromUser(i + 1));

        }

        return new Game(n, playerList);
    }

    private static Player getPlayerInfoFromUser(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name, and the symbol");
        String name = sc.next();
        String symbol = sc.next();

        System.out.println("Is this a bot player?");
        String ans = sc.next();

        if (ans.equals("Yes")) {
            System.out.println("Enter the difficulty level for the bot (1/2/3)");
            int val = sc.nextInt();
            BotDifficultyLevel botDifficultyLevel = switch (val) {
                case 1 -> BotDifficultyLevel.EASY;
                case 2 -> BotDifficultyLevel.MEDIUM;
                default -> BotDifficultyLevel.HARD;
            };
            return new BotPlayer(name, symbol.charAt(0), i + 1, botDifficultyLevel);
        }
        return new HumanPlayer(name, symbol.charAt(0), i + 1);
    }

    /**
     * Helps the user make the next move
     *
     * 1. Finds the player with next move
     * 2. Calls the makeMove method for the corresponding player
     * 3. Updates the board with that move and corresponding validation
     * 4. Check all the winning strategies
     * 5. Displays the board.
     *
     */
    public void makeNextMove() {
        if (game.getBoard().isFull()) {
            game.setDraw();
            return;
        }

        // Step 1
        int currPlayerIndex = game.getCurrPlayerIndex();
        Player currPlayer = game.playerList.get(currPlayerIndex);

        // Step 2
        System.out.printf("It's %s's move\n", currPlayer.getName());
        game.makeMoveForCurrPlayer();

        // Step4 - check for winning strategies
        game.postMoveWinnerCheck();
    }

}
