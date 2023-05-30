package Chapter1.Class.May9.Practice;
import  java.util.Scanner;

public class QarsiliqliSade {

    public static int choseMax(int a , int b)
    {
        if(a >= b) return a;
        else return b ;
    }
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int flag = 0;
        for(int i = 2 ; i <= QarsiliqliSade.choseMax(a , b) ; i++)
        {
            if(a % i == 0 && b%i == 0) flag = 1 ; break;
        }
        if(flag == 1) System.out.println("Qarsiliqli sade deyil");
        else System.out.println("Qarsiliqli sade ededdir");
    }
}
