package Chapter1.Class.June10.Task1;
import java.lang.reflect.*;
public class B {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<A> aclass = A.class;
        Constructor<A> constructor = aclass.getDeclaredConstructor(int.class , int.class);
        constructor.setAccessible(true);
        A newInstance = constructor.newInstance(12,15);
        System.out.println(newInstance.a + "  " + newInstance.b);

    }
}
