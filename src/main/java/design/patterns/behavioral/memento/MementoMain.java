package design.patterns.behavioral.memento;

public class MementoMain {
        public static void main(String[] args) {
            Game game = new Game("Level 1", 100);
            System.out.println("Initial state: Level " + game.getLevel() + ", Score: " + game.getScore());

            // Save the current state
            GameMemento memento = game.save();

            // Play the game and update the state
            game.play();
            System.out.println("Updated state: Level " + game.getLevel() + ", Score: " + game.getScore());

            // Restore the state from the memento
            game.restore(memento);
            System.out.println("Restored state: Level " + game.getLevel() + ", Score: " + game.getScore());
        }
}
