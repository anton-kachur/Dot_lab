package lab4;

public interface PointInterface {
    @Annotation(name="Method, which gets complex number")
    String toString();

    @Annotation(name="Method, which gets real part of complex number")
    double getX();

    @Annotation(name="Method, which gets imaginary part of complex number")
    double getY();

    double setX(double x_coord);
    double setY(double y_coord);

    @Annotation(name="Move method")
    void move(double x_coord, double y_coord);

    @Annotation(name="start method")
    void start();
}