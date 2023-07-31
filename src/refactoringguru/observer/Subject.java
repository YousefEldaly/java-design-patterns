package refactoringguru.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject implements ISubject{
    private List<IObserver> observersList = new ArrayList<IObserver>();
    private String message;

    @Override
    public void attach(IObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        int i = observersList.indexOf(observer);
        if (i >= 0) {
            observersList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<IObserver> iterator = observersList.iterator();
        howManyObservers();

        while (iterator.hasNext()) {
            IObserver obs = iterator.next();
            obs.update(message);
        }
    }

    public void createMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void createMessage() {
        createMessage("Empty");
    }

    public void howManyObservers() {
        System.out.println("There are " + observersList.size() + " observers in the list.");
    }

    /**
     * "Usually, the subscription logic is only a fraction of what a Subject can
     * really do. Subjects commonly hold some important business logic, that
     * triggers a notification method whenever something important is about to
     * happen (or after it)." refactoring guru
     */
    public void someBusinessLogic() {
        message = "change message message";
        notifyObservers();
        System.out.println("I'm about to do something important");
    }

    public void close(){
        System.out.println("Goodbye, I was the Subject");
    }


}
