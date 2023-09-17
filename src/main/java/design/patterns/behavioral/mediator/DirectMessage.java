package design.patterns.behavioral.mediator;

public class DirectMessage implements ChatMediator{
    private User user;

    @Override
    public void sendMessage(String message, User sender) {
        this.user.receiveMessage(message);
    }

    @Override
    public void addUser(User user) {
        this.user = user;
    }
}
