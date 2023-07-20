package design.patterns.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        // Set the melee attack strategy
        character.setAttackStrategy(new MeleeAttackStrategy());
        character.attack(); // Output: Performing melee attack!

        // Set the ranged attack strategy
        character.setAttackStrategy(new RangedAttackStrategy());
        character.attack(); // Output: Performing ranged attack!
    }
}
