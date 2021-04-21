package lab4.patternProxy.NewPointProxy;

import l2.patternProxy.NewComplexProxy.NewComplexProxy;

public class NewPointProxyController {
    private NewComplexProxy model;
    //private ComplexProxyView view;

    public NewPointProxyController(NewComplexProxy model) {
        this.model = model;
    }

    public void startController() {
        model.start();
    }

}
