package Chapter1.Class.June1.Task1;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main
{

    public static void main(String[] args) {
        BiConsumer<Integer ,Integer> function = Main::sum;
        function.accept(5,7);
    }
    static void sum(Integer a , Integer b)
    {
        System.out.println(a+b);
    }

}



