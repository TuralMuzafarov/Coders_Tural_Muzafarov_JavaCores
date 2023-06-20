package Chapter1.Class.June17.Task5;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    static BiPredicate<Integer , Integer> streetTest = new BiPredicate<Integer, Integer>() {
        @Override
        public boolean test(Integer integer, Integer integer2) {
            if(integer % 2 == 0 & integer2 % 2 == 0) return  true;
            else if(integer % 2 == 1  & integer2 % 2 == 0) return true;
            return  false;
        }
    };
    public static void main(String[] args) {
        int house1 , house2;
        house1 = new Scanner(System.in).nextInt();
        house2 = new Scanner(System.in).nextInt();
        if(Main.streetTest.test(house1 , house2)) System.out.println("0");
        else System.out.println("1");

    }
}
