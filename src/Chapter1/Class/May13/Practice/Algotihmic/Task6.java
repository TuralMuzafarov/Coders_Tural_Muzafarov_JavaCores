package Chapter1.Class.May13.Practice.Algotihmic;

import java.util.Scanner;

public class Task6 {

    private static int min(int a , int b)
    {
        if(a > b) return b;
        return a;
    }

    public static int EBOB(int a , int b)
    {
        int answer = 0;
        int iterator = Task6.min(a , b);
        for(int i = iterator ; i >= 1 ; i--)
        {
            if(a % i == 0 && b%i == 0)
            {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        int a , b;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        System.out.println(Task6.EBOB(a ,b));

    }
}
