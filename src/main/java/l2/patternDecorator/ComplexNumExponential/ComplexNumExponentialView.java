package l2.patternDecorator.ComplexNumExponential;

public class ComplexNumExponentialView {
    private ComplexNumExponential model;

    public ComplexNumExponentialView(ComplexNumExponential model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model.toString();
    }

    public ComplexNumExponential setModel(ComplexNumExponential m) {
        this.model = m;
        return this.model;
    }

}
