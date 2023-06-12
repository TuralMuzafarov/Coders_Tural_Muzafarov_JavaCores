package Chapter1.Class.June1.Task1;

import java.util.Scanner;

public class AnotherSolution {
    public static void main(String[] args) {
        int a , b ;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        arithmatic cem = (int c , int d) ->
        {
            return a+b;
        };
        System.out.println(cem.sum(a,b));
    }

}
interface arithmatic
{
    int sum(int a , int b);
}

