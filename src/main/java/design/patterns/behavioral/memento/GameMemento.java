package design.patterns.behavioral.memento;

public class GameMemento {
    private final String level;
    private final int score;

    public GameMemento(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}

