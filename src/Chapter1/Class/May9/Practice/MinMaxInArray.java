package Chapter1.Class.May9.Practice;
import  java.util.Scanner;
import  java.util.Arrays;
public class MinMaxInArray {
    public static void main(String[] args) {
        // Creating THE ARRAY
        int size;
        size = new Scanner(System.in).nextInt();
        int[] arr = new int[size];
        // FilLING THE ARRAY
        for(int i = 0 ; i < size ; i ++)
        {
            arr[i]  = new Scanner(System.in).nextInt();
        }
        // DRIVER CODE
        int min = arr[0];
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max ) max = arr[i];
            if(arr[i] < min ) min = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
