package l2.patternProxy.NewComplexProxy;

import l2.PointInterface;
import l2.ComplexNumber.ComplexNumber;
import l2.ComplexNumberExponential.ComplexNumberExponential;

public class NewComplexProxy implements PointInterface {
    private static PointInterface n;

    @Override
    public void start() {
        if (n == null) {
            n = new ComplexNumberExponential(2,3);
        }
        n.start();
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
