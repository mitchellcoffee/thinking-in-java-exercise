package ch14.ex25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex25 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        A a = SecretMaker.makeSecret();
        System.out.println("a is of class type: " + a.getClass().getName());
        for (Method m : a.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(a);
        }
    }
}
