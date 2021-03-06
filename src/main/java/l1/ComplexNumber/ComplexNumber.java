package l1.ComplexNumber;


import l1.About;
import l1.ComplexInterface;
import l1.Info;

@Info(name = "Simple form")
public
class ComplexNumber implements ComplexInterface {
    private double real;
    private double imaginary;

    public ComplexNumber(double a, double b){
        real = a;
        imaginary = b;
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
        return real;
    }

    @Override
    public double setImaginary(int i) {
        imaginary = i;
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
}
