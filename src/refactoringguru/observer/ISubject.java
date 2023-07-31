package refactoringguru.observer;

//*****************************************
//****************************************
//**************************************
// search for destructors in java and how to override them
public interface ISubject {
    public void attach(IObserver observer);
    public void detach(IObserver observer);
    public void notifyObservers();
}
