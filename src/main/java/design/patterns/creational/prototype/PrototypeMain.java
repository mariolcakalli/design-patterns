package design.patterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        // Create a prototype birthday card
        BirthdayCard prototypeCard =
                new BirthdayCard("John", "Balloon");

        // Customize the prototype card
        BirthdayCard customizedCard =
                (BirthdayCard) prototypeCard.clone();
        customizedCard.customize("Sarah");

        // Print information of the prototype and customized card
        prototypeCard.printInfo();
        customizedCard.printInfo();
    }
}
