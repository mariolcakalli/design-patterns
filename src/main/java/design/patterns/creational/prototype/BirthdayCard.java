package design.patterns.creational.prototype;

class BirthdayCard implements Prototype {
    private String recipient;
    private String design;

    public BirthdayCard(String recipient, String design) {
        this.recipient = recipient;
        this.design = design;
    }

    public void customize(String recipient) {
        this.recipient = recipient;
        // Additional customization logic here
    }

    @Override
    public Prototype clone() {
        return new BirthdayCard(recipient, design);
    }

    public void printInfo() {
        System.out.println("Recipient: " + recipient);
        System.out.println("Design: " + design);
    }
}
