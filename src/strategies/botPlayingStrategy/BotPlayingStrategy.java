package src.strategies.botPlayingStrategy;

import src.models.Board;
import src.models.Move;
import src.models.Player;


public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
