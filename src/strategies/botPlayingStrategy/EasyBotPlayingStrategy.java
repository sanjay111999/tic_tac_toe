package src.strategies.botPlayingStrategy;

import src.models.*;

/**
 * This strategy is simple to iterate over the board
 */
public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move decideMove(Player player, Board board) {
        for (int row=0; row<board.getBoard().size(); row++) {
            for (int col = 0; col < board.getBoard().size(); col++) {
                if (board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
                    return new Move(player, new Cell(row, col));
                }
            }
        }
        return null;
    }
}
