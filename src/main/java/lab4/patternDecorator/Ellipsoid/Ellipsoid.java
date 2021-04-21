package lab4.patternDecorator.Ellipsoid;

import lab4.Annotation;
import lab4.ClassAnnotation;
import lab4.Point.Point;
import lab4.PointInterface;

@ClassAnnotation(name = "Ellipsoid class")
public class Ellipsoid implements PointInterface {
    private Point p;

    public Ellipsoid(Point p){
        this.p = p;
    }

    @Override
    @Annotation(name="Get parameters of ellipsoid")
    public String toString() {
        return "Center coords = (" + p.getX() + ", " + p.getY() + ")\n" +
                "Semi-major axes lengths: a=" + p.getX()*2 + ", b=" + p.getY()*3;
    }

    @Override
    @Annotation(name="Get center x coordinate")
    public double getX() {
        return 0.0;
    }

    @Override
    @Annotation(name="Get center y coordinate")
    public double getY() { return 0.0; }

    @Override
    public double setX(double x_coord) {
        return 0;
    }

    @Override
    public double setY(double y_coord) {
        return 0;
    }

    @Annotation(name="Get perimeter of ellipsoid")
    public double getPerim(){
        return  0.0;
    }

    public void move(double x_coord, double y_coord){
        p.setX(p.getX()+x_coord);
        p.setY(p.getY()+y_coord);
    }

    @Override
    public void start() {
        System.out.println(this.toString());
    }

}
