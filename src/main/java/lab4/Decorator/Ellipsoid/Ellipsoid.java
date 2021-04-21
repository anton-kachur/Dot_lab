package lab4.Decorator.Ellipsoid;

import lab4.Annotation;
import lab4.ClassAnnotation;
import lab4.Point.Point;
import lab4.PointInterface;
import org.apache.commons.math3.util.Precision;

@ClassAnnotation(name = "Ellipsoid class")
public class Ellipsoid implements PointInterface {
    private Point p;
    private double a;
    private double b;

    public Ellipsoid(Point p){
        this.p = p;
        this.a = p.getX()*2;
        this.b = p.getY()*3;
    }

    @Override
    @Annotation(name="Get parameters of ellipsoid")
    public String toString() {
        return "Ellipsoid, generated from point\nCenter coords = (" + p.getX() + ", " + p.getY() + ")\n" +
                "Semi-major axes lengths: a=" + a + ", b=" + b;
    }

    @Override
    @Annotation(name="Get center x coordinate")
    public double getX() { return p.getX(); }

    @Override
    @Annotation(name="Get center y coordinate")
    public double getY() { return p.getY(); }

    @Override
    public double setX(double x_coord) {
        p.setX(x_coord);
        return p.getX();
    }

    @Override
    public double setY(double y_coord) {
        p.setY(y_coord);
        return p.getY();
    }

    @Annotation(name="Get perimeter of ellipsoid")
    public double getPerim(){
        return Precision.round(4*((Math.PI*a*b - Math.pow((a - b), 2))/(a + b)), 3);
    }

    public void move(double x_coord, double y_coord){
        p.setX(p.getX()+x_coord);
        p.setY(p.getY()+y_coord);
    }

    @Override
    public void start() {
        System.out.println(this.toString());
        System.out.println("Perimeter = " + this.getPerim());
    }
}
