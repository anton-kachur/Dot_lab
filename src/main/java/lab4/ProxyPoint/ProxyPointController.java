package lab4.ProxyPoint;

import java.lang.reflect.Method;

public class ProxyPointController {
    private ProxyPoint model;
    //private ComplexProxyView view;

    public ProxyPointController(ProxyPoint model) {
        this.model = model;
    }


    public Object invokeController(Object proxy, Method method, Object[] args) throws Throwable {
       return model.invoke(proxy, method, args);
    }

}
