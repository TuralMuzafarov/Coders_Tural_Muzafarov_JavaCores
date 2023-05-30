package Chapter1.Class.May13.Practice.Algotihmic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int number;
        number = new Scanner(System.in).nextInt();
        StringBuilder a = new StringBuilder("");
        while(number!=0)
        {
            a.append(Integer.toString(number%2));
            number=number/2;
        }
        System.out.println(a.reverse());
    }
}
