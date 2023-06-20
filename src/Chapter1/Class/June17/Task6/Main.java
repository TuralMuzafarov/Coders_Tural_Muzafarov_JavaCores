package Chapter1.Class.June17.Task6;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    static int function(int a)
    {
        int count = 0;
        while(a != 0)
        {
            count++;
            a = a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        int count = 0;
        int startIndex = 0;
        int endIndex = input.length();

        while (startIndex < endIndex)
        {
            startIndex += Main.function((int) Math.pow(2,count));
            count++;
        }
        System.out.println(count);


    }
}
