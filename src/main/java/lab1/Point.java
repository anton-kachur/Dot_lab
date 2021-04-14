package lab1;

@ClassAnnotation(name = "Point class")
public class Point implements PointInterface {
    private double x;
    private double y;

    public Point(double x_coord, double y_coord){
        x = x_coord;
        y = y_coord;
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
        return x;
    }

    @Override
    public double setY(double y_coord) {
        y = y_coord;
        return y;
    }

    @Override
    public void move(double x_coord, double y_coord) {
        x += x_coord;
        y += y_coord;
    }
}
