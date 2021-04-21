package lab4.Proxy.NewPointProxy;

public class NewPointProxyController {
    private NewPointProxy model;
    private NewPointProxyView view;

    public NewPointProxyController(NewPointProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }

}
