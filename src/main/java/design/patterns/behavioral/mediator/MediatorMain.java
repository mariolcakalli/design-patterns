package design.patterns.behavioral.mediator;

public class MediatorMain {
        public static void main(String[] args) {
            ChatMediator chatMediator = new ChatRoom();

            User alice = new User("Alice", chatMediator);
            User bob = new User("Bob", chatMediator);
            User charlie = new User("Charlie", chatMediator);
            User max = new User("Max", chatMediator);

            chatMediator.addUser(alice);
            chatMediator.addUser(bob);
            chatMediator.addUser(charlie);
            chatMediator.addUser(max);

            alice.sendMessage("Hello everyone!"); // Broadcasts the message to all users
            bob.sendMessage("Hi Alice!"); // Broadcasts the message to all users
            charlie.sendMessage("Hi Alice and Bob!"); // Broadcasts the message to all users

        }
}
