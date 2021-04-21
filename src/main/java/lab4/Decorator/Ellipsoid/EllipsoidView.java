package lab4.Decorator.Ellipsoid;

import lab4.Ellipsoid.Ellipsoid;

public class EllipsoidView {
    private lab4.Ellipsoid.Ellipsoid model;

    public EllipsoidView(Ellipsoid model) {
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
}
