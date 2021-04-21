package lab1.Ellipsoid;

public class EllipsoidView {
    private Ellipsoid model;

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
