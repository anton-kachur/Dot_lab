package l2;

import l2.ComplexNumber.ComplexNumber;
import l2.patternProxy.NewComplexProxy.NewComplexProxy;

public interface PointInterface {
    @About(name="Method, which gets complex number")
    String toString();

    @About(name="Method, which gets real part of complex number")
    String getReal();

    @About(name="Method, which gets imaginary part of complex number")
    String getImaginary();

    double setReal(int r);
    double setImaginary(int i);

    @About(name="Method, which gets the sum of complex numbers")
    ComplexNumber sumNumbers(ComplexNumber num);

    @About(name="Method, which gets the difference of complex numbers")
    ComplexNumber minusNumbers(ComplexNumber num);

    @About(name="Method, which gets the product of complex numbers")
    ComplexNumber timesNumbers(ComplexNumber num);

    @About(name="Method, which starts some task")
    void start();
}