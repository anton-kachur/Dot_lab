package lab4.Point;

public class PointController {
    private Point model;
    //private PointView view;

    public PointController(Point model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }
    public double getCoordX() {
        return model.getX();
    }
    public double getCoordY() {
        return model.getY();
    }

    public double setCoordX(double x) {
        return model.setX(x);
    }
    public double setCoordY(double y) {
        return model.setY(y);
    }

    public Point setModel(Point m) {
        this.model = m;
        return this.model;
    }
}
