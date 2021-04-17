package lab1.ProxyPoint;

import lab1.Annotation;
import lab1.ClassAnnotation;

import java.lang.reflect.*;

@ClassAnnotation(name = "Proxy class for point")
public class ProxyPoint implements InvocationHandler{
    private Object o;

    private ProxyPoint(Object obj) {
        this.o = obj;
    }

    @Override
    @Annotation(name = "Call methods from object")
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get"))
            return method.invoke(o, args);
        throw new IllegalAccessException("Set method detected!");
    }

    public static Object newProxyInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new ProxyPoint(obj));
    }
}
