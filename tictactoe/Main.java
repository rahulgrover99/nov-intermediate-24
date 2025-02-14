package com.example.splitwise.demo.tictactoe;

import com.example.splitwise.demo.tictactoe.controllers.GameController;
import com.example.splitwise.demo.tictactoe.models.Board;
import com.example.splitwise.demo.tictactoe.models.Game;
import com.example.splitwise.demo.tictactoe.models.GameState;

public class Main {
    public static void main(String[] args) {

        Game game = GameController.initialiseGame();

        GameController gc = new GameController(game);

        while(game.getGameState().equals(GameState.IN_PROGRESS)) {
            game.getBoard().displayBoard();
            // Prints the next player's move.
            // Ask the user for an input
            gc.makeNextMove();


        }

        game.getBoard().displayBoard();



    }

}
