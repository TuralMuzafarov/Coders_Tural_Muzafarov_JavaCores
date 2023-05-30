package Chapter1.Class.May7;
import java.util.Scanner;
public class PolyndromeTest {
    public static void main(String [] args)
    {
        System.out.println("Enter the value: ");
        Scanner reader = new Scanner(System.in);
        int value = reader.nextInt();
        int cpy = value;
        int test = 0;
        while(cpy != 0)
        {
            test*=10;
            test+= cpy%10;
            cpy/=10;
        }
        if(test == value) System.out.println("Polyndrome");
        else System.out.println("No");
    }
}
