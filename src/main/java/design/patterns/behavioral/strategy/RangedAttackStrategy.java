package design.patterns.behavioral.strategy;

public class RangedAttackStrategy implements AttackStrategy {
    public void attack() {
        System.out.println("Performing ranged attack!");
    }
}

