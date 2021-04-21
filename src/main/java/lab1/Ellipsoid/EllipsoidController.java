package lab1.Ellipsoid;

public class EllipsoidController {
    private Ellipsoid model;
    //private Ellipsoid view;

    public EllipsoidController(Ellipsoid model) {
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

    public double getEllipsoidPerim() { return model.getPerim(); }

    public Ellipsoid setModel(Ellipsoid m) {
        this.model = m;
        return this.model;
    }
}
