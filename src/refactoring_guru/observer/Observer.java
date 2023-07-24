package refactoring_guru.observer;

public class Observer implements IObserver{
    private String messageFromSubject;
    private Subject subject;
    private static int staticNumber;
    private int number;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);
        System.out.println("Hi, I'm the Observer \"" + (++staticNumber) + "\".");
        this.number = staticNumber;
    }

    @Override
    public void update(String message_from_subject) {
        this.messageFromSubject = message_from_subject;
        printInfo();
    }

    public void removeMeFromTheList() {
        this.subject.detach(this);
        System.out.println("Observer \"" + this.number + "\" removed from the list");
    }

    public void printInfo() {
        System.out.println("Observer \"" + this.number + "\": a new message is available --> "
                + this.messageFromSubject);
    }


    public void close() {
        System.out.println("Goodbye, I was the Observer \"" + this.number + "\".");

    }
}
