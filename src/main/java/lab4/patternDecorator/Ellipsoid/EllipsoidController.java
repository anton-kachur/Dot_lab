package lab4.patternDecorator.Ellipsoid;

import lab4.Ellipsoid.Ellipsoid;

public class EllipsoidController {
    private lab4.Ellipsoid.Ellipsoid model;
    //private Ellipsoid view;

    public EllipsoidController(lab4.Ellipsoid.Ellipsoid model) {
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

    public lab4.Ellipsoid.Ellipsoid setModel(Ellipsoid m) {
        this.model = m;
        return this.model;
    }
}
