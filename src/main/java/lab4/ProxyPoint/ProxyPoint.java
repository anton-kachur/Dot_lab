package lab4.ProxyPoint;

import lab4.Annotation;
import lab4.ClassAnnotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new ProxyPoint(obj));
    }
}
