package Chapter1.Class.June10.Task2;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoNegativeValueException {
        TestBankasi A = new TestBankasi(1,2,-3);
        if (A.getClass().isAnnotationPresent(OnlyPositive.class)) {
            for(Field field : A.getClass().getDeclaredFields())
            {
                if (field.getType() == int.class)
                {
                    if(field.getInt(A) < 0)
                    {
                        throw new NoNegativeValueException("Please add positive value to  the annotated field of the given class!");
                    }
                }
            }

        }

    }


}
