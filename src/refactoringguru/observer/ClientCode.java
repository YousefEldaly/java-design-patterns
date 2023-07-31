package refactoringguru.observer;

public class ClientCode {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer(subject);
        Observer observer2 = new Observer(subject);
        Observer observer3 = new Observer(subject);
        Observer observer4;
        Observer observer5;

        subject.createMessage("Hello World! :D");
        observer3.removeMeFromTheList();

        subject.createMessage("The weather is hot today! :p");
        observer4 = new Observer(subject);

        observer2.removeMeFromTheList();
        observer5 = new Observer(subject);

        subject.createMessage("My new car is great! ;)");
        observer5.removeMeFromTheList();

        observer4.removeMeFromTheList();
        observer1.removeMeFromTheList();

        observer5.close();
        observer5 = null;
        observer4.close();
        observer4 = null;
        observer3.close();
        observer3 = null;
        observer2.close();
        observer2 = null;
        observer1.close();
        observer1 = null;
        System.gc();
        // simulattion to delete as java doesn't have delete keyword
        // Error:observer5.printInfo();


    }


}
