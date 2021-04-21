package lab4.patternProxy.NewPointProxy;

class NewPointProxyView {
    private NewPointProxy model;

    public NewPointProxyView(NewPointProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }
}
