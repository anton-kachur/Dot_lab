package l2.ComplexNumber;


import l2.About;
import l2.PointInterface;
import l2.Info;
import l2.patternObserver.Notifier;
import l2.patternObserver.Observer;

import java.util.ArrayList;
import java.util.List;

@Info(name = "Simple form")
public class ComplexNumber implements PointInterface, Notifier {
    private double real;
    private double imaginary;
    private List observers;

    public ComplexNumber(double a, double b){
        real = a;
        imaginary = b;
        observers = new ArrayList();
    }

    @Override
    @About(name="Method, which gets complex number")
    public String toString() {
        return (real!=0)? real + " + " + imaginary + "i": imaginary + "i";
    }

    @Override
    @About(name="Method, which gets real part of complex number")
    public String getReal() {
        return ""+real;
    }

    @Override
    @About(name="Method, which gets imaginary part of complex number")
    public String getImaginary() { return ""+imaginary+"i"; }

    @Override
    public double setReal(int r) {
        real = r;
        notifyObserver();
        return real;
    }

    @Override
    public double setImaginary(int i) {
        imaginary = i;
        notifyObserver();
        return imaginary;
    }

    @Override
    public ComplexNumber sumNumbers(ComplexNumber num) {
        ComplexNumber n = new ComplexNumber(Double.parseDouble(this.getReal()) + Double.parseDouble(num.getReal()), Double.parseDouble(this.getImaginary().replaceFirst(".$","")) + Double.parseDouble(num.getImaginary().replaceFirst(".$","")));
        System.out.println("AAAAAA: " + n.getReal());
        return new ComplexNumber(Double.parseDouble(this.getReal()) + Double.parseDouble(num.getReal()), Double.parseDouble(this.getImaginary().replaceFirst(".$","")) + Double.parseDouble(num.getImaginary().replaceFirst(".$","")));
    }

    @Override
    public ComplexNumber minusNumbers(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imaginary - num.imaginary);
    }

    @Override
    public ComplexNumber timesNumbers(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real - this.imaginary + num.imaginary, this.real + num.imaginary - this.imaginary + num.real);
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
            obs.update(real, imaginary);
        }
    }
}
