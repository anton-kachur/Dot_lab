package lab1;

import lab1.ProxyPoint.ProxyPoint;
import lab1.Ellipsoid.Ellipsoid;
import lab1.Point.Point;

import java.lang.String;
import java.lang.reflect.*;
import java.lang.*;

public class lab1 {

    public static void main (String []args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Point p1 = new Point(3.0, 5.3);
        Ellipsoid e = new Ellipsoid(new double[]{1.0, 2.0, 0.0, 0.0, 5.0, 5.0});

        Class clazz = Ellipsoid.class;
        Method[] methods = clazz.getMethods();
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("Class: " + clazz.getName() + "\n");

        System.out.println("Modifiers: ");
        int mods = Ellipsoid.class.getModifiers();

        if (Modifier.isPublic(mods)) System.out.println("Public");
        else if (Modifier.isPrivate(mods)) System.out.println("Private");

        for (Constructor constructor: constructors) {
            if (clazz.isAnnotationPresent(ClassAnnotation.class)) {
                System.out.println("Constructor: " + constructor.getName());
                Parameter [] names = constructor.getParameters();
                System.out.print("Parameters:\n");
                for (Parameter name : names) {
                    System.out.print("" + name +"\n");
                }
                System.out.print("\n");
            }
        }

        for (Method method : methods)
            if (method.isAnnotationPresent(Annotation.class))
                System.out.println("Method: " + method.getAnnotation(Annotation.class).name() + " -> " + method.invoke(e));

        System.out.println("\n" + p1.toString());
        PointInterface proxy = (PointInterface) ProxyPoint.newProxyInstance(p1);
        System.out.println("Get x coordinate of point " + proxy.getX());
        System.out.println("Everything is fine");
        System.out.println("\nSet x coordinate of point");
        proxy.setX(5.0);

    }
}

