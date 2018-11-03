package ai;

import board.Board;
import board.Move;

public interface AI {
    Move getMove(Board board, int player);
}
