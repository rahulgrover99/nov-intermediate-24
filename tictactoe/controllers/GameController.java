package com.example.splitwise.demo.tictactoe.controllers;

import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.HumanPlayer;
import com.example.splitwise.demo.tictactoe.models.Player;

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
            System.out.println("Enter the player name, and the symbol");
            String name = sc.next();
            String symbol = sc.next();
            // TODO: Handle bot players as Input.
            playerList.add(new HumanPlayer(name, symbol.charAt(0), i + 1));
        }

        return new Game(n, playerList);
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
