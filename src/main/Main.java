package main;

import board.Board;
import board.Game;
import board.Move;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Board b = new Board(3, 3, 3);
        b.printBoard();
        b.place(new Move(0, 2, Board.SQUARE_PLAYER_BLACK));
        b.place(new Move(1, 1, Board.SQUARE_PLAYER_BLACK));
        b.place(new Move(2, 0, Board.SQUARE_PLAYER_BLACK));
        b.printBoard();
        System.out.println(b.getGameStatus().getGameStatus());
        System.out.println();
        System.out.println(new Random().nextInt(3) + 1);
        */
        /*
        Game game = new Game();
        try {
            game.play(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        Game game = new Game();
        try {
            game.playManyTimesNoPrint(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
