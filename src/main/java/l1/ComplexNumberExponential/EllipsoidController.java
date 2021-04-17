package l1.ComplexNumberExponential;

public class EllipsoidController {
    private Ellipsoid model;
    //private ComplexNumberExponentialView view;

    public EllipsoidController(Ellipsoid model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public Ellipsoid setModel(Ellipsoid m) {
        this.model = m;
        return this.model;
    }

}
