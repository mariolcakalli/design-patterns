package design.patterns.behavioral.command;

public class TurnCommand implements Command {
    private final Robot robot;

    public TurnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turn();
    }
}
