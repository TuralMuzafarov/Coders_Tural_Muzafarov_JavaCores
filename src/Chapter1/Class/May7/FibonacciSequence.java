package Chapter1.Class.May7;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String [] args)
    {

        System.out.println("Enter the size of the array : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr  = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int flag = 0;
        for(int i = 2 ; i < size ; i++)
        {
            if(arr[i] != arr[i-1] + arr[i-2]) {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("No");
        }else System.out.println("Yes");


    }
}
