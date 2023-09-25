package src.strategies.gameWinningStrategy;

import src.models.Board;
import src.models.Move;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return true;
    }
}
