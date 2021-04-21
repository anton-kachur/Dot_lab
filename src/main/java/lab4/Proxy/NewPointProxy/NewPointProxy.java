package lab4.Proxy.NewPointProxy;

import lab4.Ellipsoid.Ellipsoid;
import lab4.PointInterface;

public class NewPointProxy implements PointInterface {
    private static PointInterface n;

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double setX(double x_coord) {
        return 0;
    }

    @Override
    public double setY(double y_coord) {
        return 0;
    }

    @Override
    public void move(double x_coord, double y_coord) {

    }

    @Override
    public void start() {
        if (n == null) {
            n = new Ellipsoid(new double[]{1, 2, 3, 4, 5, 6});
        }
        n.start();
    }


}
