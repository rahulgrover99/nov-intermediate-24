package com.example.splitwise.demo.tictactoe.controllers;

import com.example.splitwise.demo.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    Game game;
    public BoardController boardController;

    public GameController(Game game) {
        this.game = game;
        this.boardController = new BoardController(game.board);
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
        if (boardController.isFull()) {
            game.setDraw();
            return;
        }

        // Step 1
        int currPlayerIndex = game.getCurrPlayerIndex();
        Player currPlayer = game.playerList.get(currPlayerIndex);

        // Step 2
        System.out.printf("It's %s's move\n", currPlayer.getName());
        makeMoveForCurrPlayer();

        // Step4 - check for winning strategies
        postMoveWinnerCheck();
    }

    public void undoLastMove() {
        // 1. Remove from moves list
        Cell moveCell = game.moves.get(game.moves.size() - 1);
        game.moves.remove(moveCell);

        // 2. Updating the board without that cell
        Cell cell = game.getBoard().getCells().get(moveCell.getRow()).get(moveCell.getCol());
        cell.setPlayer(null);
        cell.setCellState(CellState.FREE);

        // 3. Update the curr player.
        game.currPlayerIndex = (game.currPlayerIndex - 1 + game.playerList.size()) % game.playerList.size();

    }

    private void makeMoveForCurrPlayer() {
        Player currPlayer = this.game.playerList.get(game.currPlayerIndex);
        Cell cell = currPlayer.makeMove(game.board, currPlayer);
        try {
            this.boardController.updateBoard(cell, currPlayer);
            this.game.moves.add(cell);
        } catch (IllegalArgumentException e) {
            System.out.println("Please choose a valid cell.");
            makeMoveForCurrPlayer();
        }
    }

    private void postMoveWinnerCheck() {
        boolean isWin = game.getWinningStrategies().stream()
                .anyMatch(winningStrategy -> winningStrategy.isWinning(game));

        if (isWin) {
            game.setWinner();
        } else {
            game.currPlayerIndex += 1;
            game.currPlayerIndex %= game.playerList.size();
        }
    }

}
