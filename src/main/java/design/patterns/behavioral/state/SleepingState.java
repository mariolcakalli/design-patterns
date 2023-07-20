package design.patterns.behavioral.state;

public class SleepingState implements RobotState {
    public void performAction() {
        System.out.println("Robot is sleeping and snoring Zzz...");
    }
}
