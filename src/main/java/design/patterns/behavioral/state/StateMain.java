package design.patterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // Robot is initially in the Happy state
        robot.performAction(); // Output: Robot is jumping and dancing happily!

        // Change the state to Sleeping
        robot.setState(new SleepingState());
        robot.performAction(); // Output: Robot is sleeping and snoring Zzz...
    }
}
