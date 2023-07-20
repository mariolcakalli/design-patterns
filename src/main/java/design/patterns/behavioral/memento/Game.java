package design.patterns.behavioral.memento;

public class Game {
    private String level;
    private int score;

    public Game(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public void play() {
        // Play the game and update the level and score
        level = "Level 2";
        score += 50;
        System.out.println("Playing game: Level " + level + ", Score: " + score);
    }

    public GameMemento save() {
        // Create a memento object with the current state
        return new GameMemento(level, score);
    }

    public void restore(GameMemento memento) {
        // Restore the state from the memento object
        this.level = memento.getLevel();
        this.score = memento.getScore();
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
