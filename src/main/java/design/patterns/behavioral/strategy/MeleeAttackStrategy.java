package design.patterns.behavioral.strategy;

public class MeleeAttackStrategy implements AttackStrategy {
    public void attack() {
        System.out.println("Performing melee attack!");
    }
}

