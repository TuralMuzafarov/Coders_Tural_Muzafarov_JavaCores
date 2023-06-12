package Chapter1.Class.June10.Task1Demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class B {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException,NoSuchMethodException {
        Constructor<A> constructor = A.class.getDeclaredConstructor(String.class , int.class);
        constructor.setAccessible(true);
        A obj = constructor.newInstance("Tural" , 125);
        System.out.println(obj.name);
    }
}
