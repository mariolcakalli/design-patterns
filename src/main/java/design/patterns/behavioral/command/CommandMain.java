package design.patterns.behavioral.command;

public class CommandMain {
        public static void main(String[] args) {
            Robot robot = new Robot();

            RobotController controller = new RobotController();

            // Create command objects and assign them to the controller
            Command walkCommand = new WalkCommand(robot);
            controller.setCommand(walkCommand);
            controller.executeCommand();

            Command turnCommand = new TurnCommand(robot);
            controller.setCommand(turnCommand);
            controller.executeCommand();

            Command jumpCommand = new JumpCommand(robot);
            controller.setCommand(jumpCommand);
            controller.executeCommand();
        }
}
