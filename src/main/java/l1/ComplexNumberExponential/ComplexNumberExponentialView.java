package l1.ComplexNumberExponential;

public class ComplexNumberExponentialView {
    private Ellipsoid model;

    public ComplexNumberExponentialView(Ellipsoid model) {
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
