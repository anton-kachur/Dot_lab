package lab4.Proxy.NewPointProxy;

class NewPointProxyView {
    private NewPointProxy model;

    public NewPointProxyView(NewPointProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }
}
