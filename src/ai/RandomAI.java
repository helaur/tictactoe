package ai;

import board.Board;
import board.Move;

import java.util.Random;

public class RandomAI  implements AI{

    @Override
    public Move getMove(Board board, int player) {
        Random r = new Random();
        int col = r.nextInt(board.getBoard().length);
        int row = r.nextInt(board.getBoard().length);
        if(board.getBoard()[row][col] != Board.SQUARE_EMPTY) {
            return getMove(board,player);
        }
        return new Move(row, col, player);
    }
}
