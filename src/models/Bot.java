package src.models;

/**
 *
 */
public class Bot extends Player{
    private BotDifficultyLevel difficultyLevel;

    public Bot(char symbol, String name, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, PlayerType.BOT);
        this.difficultyLevel = botDifficultyLevel;

    }

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
