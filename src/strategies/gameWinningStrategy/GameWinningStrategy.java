package src.strategies.gameWinningStrategy;

import src.models.Board;
import src.models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);
}
