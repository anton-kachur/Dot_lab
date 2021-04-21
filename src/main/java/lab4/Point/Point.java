package lab4.Point;

import lab4.ObserverPattern.Observer;
import lab4.Annotation;
import lab4.ClassAnnotation;
import lab4.PointInterface;
import lab4.ObserverPattern.Notifier;

import java.util.ArrayList;
import java.util.List;

@ClassAnnotation(name = "Point class")
public class Point implements PointInterface, Notifier {
    private double x;
    private double y;
    private List observers;

    public Point(double x_coord, double y_coord){
        x = x_coord;
        y = y_coord;
        observers = new ArrayList();
    }

    @Override
    @Annotation(name="Get point")
    public String toString() { return "Point("+x+", "+y+")"; }

    @Override
    @Annotation(name="Get x coordinate")
    public double getX() {
        return x;
    }

    @Override
    @Annotation(name="Get y coordinate")
    public double getY() { return y; }

    @Override
    public double setX(double x_coord) {
        x = x_coord;
        notifyObserver();
        return x;
    }

    @Override
    public double setY(double y_coord) {
        y = y_coord;
        notifyObserver();
        return y;
    }

    @Override
    public void move(double x_coord, double y_coord) {
        x += x_coord;
        y += y_coord;
    }

    @Override
    public void start() {
        System.out.println(this.toString());
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            Observer obs = (Observer)observers.get(i);
            obs.update(x, y);
        }
    }
}
