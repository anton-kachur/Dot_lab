package l2.patternDecorator.ComplexNumExponential;

import l2.About;
import l2.PointInterface;
import l2.ComplexNumber.ComplexNumber;
import l2.Info;

@Info(name = "Exponential form")
public class ComplexNumExponential implements PointInterface {
    private ComplexNumber number;

    public ComplexNumExponential(ComplexNumber number){
        this.number = number;
    }

    @Override
    public void start() {
        System.out.println(this.toString());
    }

    @Override
    @About(name="Method, which gets complex number")
    public String toString() {
        double mod =
                Math.sqrt(Math.pow(Double.parseDouble(number.getReal()), 2) +
                Math.pow(Double.parseDouble(number.getImaginary().substring(0, number.getImaginary().length() - 1)), 2));
        double arg = Math.atan(Double.parseDouble(number.getImaginary().substring(0, number.getImaginary().length() - 1))/
                Double.parseDouble(number.getReal()));
        return Math.round(mod) + "e^i" + Math.round(arg);
    }

    @Override
    public String getReal() {
        return null;
    }

    @Override
    public String getImaginary() {
        return null;
    }

    @Override
    public double setReal(int r) {
        return 0;
    }

    @Override
    public double setImaginary(int i) {
        return 0;
    }

    @Override
    public ComplexNumber sumNumbers(ComplexNumber num) {
        return null;
    }

    @Override
    public ComplexNumber minusNumbers(ComplexNumber num) {
        return null;
    }

    @Override
    public ComplexNumber timesNumbers(ComplexNumber num) {
        return null;
    }
}
