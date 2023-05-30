package Chapter1.Class.May7;
import java.util.Scanner;
public class TheNumberOfSimvols {
    public static void main(String [] args)
    {
        String input;
        System.out.println("Enter your string: ");
        int[] arr = new int[256];
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        // 256 MEANS ASCII tables elements
        for(int i = 0 ; i < input.length() ; i++)
        {
            for(int k = 0 ; k < 256 ; k++)
            {
                if(input.charAt(i) == k)
                {
                    arr[k]++;
                }
            }
        }
        for(int i = 0 ; i < 256 ; i++)
        {
            if(arr[i] != 0)
            {
                System.out.println((char) i + ":" + arr[i]);
            }
        }
    }

}
