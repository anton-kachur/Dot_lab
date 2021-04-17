package l1;

import l1.ComplexNumber.ComplexNumber;
import l1.ComplexNumberExponential.Ellipsoid;
import l1.ComplexProxy.ComplexProxy;

import java.lang.String;
import java.lang.reflect.*;
import java.lang.*;

//Anton Kachur TI-82
//Task: 7.Create a complex numbers using Java

public class ProgEng_lab_1 {

    //**************************Generates random name************************************************
    public static void main (String []args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        ComplexNumber n1 = new ComplexNumber(1, 2);
        Ellipsoid n2 = new Ellipsoid(1, 2);

        Class clazz = Ellipsoid.class;
        Method[] methods = clazz.getMethods();
        System.out.println("Class: " + clazz.getName() + ";\nSuperclass: " + clazz.getSuperclass().getName()+";\n");

        System.out.println("Class name: " + clazz.getSimpleName());
        for (Method method : methods) {
            if (method.isAnnotationPresent(About.class)) {
                System.out.println("Method: " + method.getAnnotation(About.class).name() + " -> " + method.invoke(n2));
                Class<?>[] params = method.getParameterTypes();
                System.out.print("Parameters: ");
                for (Class<?> paramType : params) {
                    System.out.print(" " + paramType.getName() + "\n");
                }
                System.out.print("\n");
            }
        }

        ComplexInterface proxy = (ComplexInterface) ComplexProxy.newProxyInstance(n1);
        System.out.println("Setting real part...");
        proxy.setReal(12);
        System.out.println("GetReal method: "+ proxy.getReal());
    }
}

