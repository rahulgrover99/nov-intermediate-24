package com.example.splitwise.demo.tictactoe;

import com.example.splitwise.demo.tictactoe.controllers.GameController;
import com.example.splitwise.demo.tictactoe.models.Board;
import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.GameState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = GameController.initialiseGame();

        GameController gc = new GameController(game);
        gc.boardController.displayBoard();
        while(game.getGameState().equals(GameState.IN_PROGRESS)) {
            // Prints the next player's move.
            // Ask the user for an input
            gc.makeNextMove();
            gc.boardController.displayBoard();
            System.out.println("Do you want to undo the last move?");
            Scanner sc = new Scanner(System.in);
            String ans = sc.next();
            if (ans.equals("Yes")) {
                gc.undoLastMove();
                gc.boardController.displayBoard();
            }
        }

        gc.boardController.displayBoard();

        if (game.getGameState().equals(GameState.WINNING)) {
            System.out.printf("The winner of the game is %s\n", game.getWinner().getName());
        } else {
            System.out.println("The game has ended in a draw");
        }



    }

}
