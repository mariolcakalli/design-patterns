package design.patterns.behavioral.state;

public class Robot {
    private RobotState currentState;

    public Robot() {
        // Initialize with the default state
        currentState = new HappyState();
    }

    public void setState(RobotState state) {
        currentState = state;
    }

    public void performAction() {
        currentState.performAction();
    }
}

