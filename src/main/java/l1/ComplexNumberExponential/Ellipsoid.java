package l1.ComplexNumberExponential;

import l1.About;
import l1.ComplexNumber.ComplexNumber;
import l1.Info;

import java.lang.Math;

@Info(name = "Exponential form")
public
class Ellipsoid extends ComplexNumber {
    private double real;
    private double imaginary;


    public Ellipsoid(double a, double b){
        super(a, b);
        real = a;
        imaginary = b;
    }

    @Override
    @About(name="Method, which gets complex number in exponential form")
    public String toString() {
        double mod = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
        double arg = Math.atan(imaginary/real);
        return Math.round(mod) + "e^i" + Math.round(arg);
    }
}
