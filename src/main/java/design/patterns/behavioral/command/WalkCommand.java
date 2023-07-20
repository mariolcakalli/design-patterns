package design.patterns.behavioral.command;

public class WalkCommand implements Command {
    private final Robot robot;

    public WalkCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.walk();
    }
}
