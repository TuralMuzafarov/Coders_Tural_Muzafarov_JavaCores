package Chapter1.Class.May13.Practice.Algotihmic;

import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        // Creating Arrays
        int[] array1 = new int[51];
        int[] array2 = new int[52];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1;
        size1 = scanner.nextInt();
        for(int i = 0 ; i < size1 ; i++)
        {
            array1[i] = scanner.nextInt();
        }
        int size2;
        System.out.println("Enter the size of the second array");
        size2 = scanner.nextInt();
        for(int i = 0 ; i < size2 ; i++)
        {
            array2[i] = scanner.nextInt();
        }

        //Intersection of the arrays;
        List<Integer>intersection = new ArrayList<Integer>();
        for(int i = 0 ; i < size1 ; i++)
        {
            for(int k = 0; k < size2; k++)
            {
                if(array2[k] == array1[i])
                {
                    intersection.add(array1[i]);
                    break;
                }
            }
        }
        System.out.println("Intersection of the array1 and array2 : ");
        for(int i = 0 ; i < intersection.size();i++)
        {
            System.out.println(intersection.get(i) + " ");
        }

        // Union of the arrays;
        int[] union = new int[size1+size2];
        for(int i = 0 ; i < size1 ; i++)
        {
            union[i] = array1[i];
        }
        for(int k = 0 ; k < size2 ; k++)
        {
            union[size1+k] = array2[k];
        }
        System.out.println("Union of the array1 and array2:");
        for(int i = 0 ; i < union.length ; i++)
        {
            System.out.println(union[i] + " ");
        }


    }
}
