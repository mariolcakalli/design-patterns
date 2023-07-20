package design.patterns.behavioral.mediator;

public class User {
    private final String name;
    private final ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

