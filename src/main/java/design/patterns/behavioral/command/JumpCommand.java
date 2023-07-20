package design.patterns.behavioral.command;

public class JumpCommand implements Command {
    private final Robot robot;

    public JumpCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.jump();
    }
}
