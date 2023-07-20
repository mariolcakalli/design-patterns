package design.patterns.behavioral.state;

public class HappyState implements RobotState {
    public void performAction() {
        System.out.println("Robot is jumping and dancing happily!");
    }
}

