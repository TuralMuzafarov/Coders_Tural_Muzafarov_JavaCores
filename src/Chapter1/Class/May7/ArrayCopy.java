package Chapter1.Class.May7;

import java.util.Scanner;
import  java.util.Arrays;

public class ArrayCopy {
    public static void main(String [] args)
    {
        Scanner Reader = new Scanner(System.in);

        int[] array = {3,4,5,7};

        System.out.println("Enter the number you wanna to add into array: ");

        int number = Reader.nextInt();
        int[] newArray = new int[array.length + 1];
        for(int k = 0 ; k < array.length ; k++)
        {
            newArray[k] = array[k];
        }
        newArray[array.length] = number;
        Arrays.sort(newArray);
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
}
