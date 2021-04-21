package lab4.ObserverPattern;

public interface Notifier {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver();
}
