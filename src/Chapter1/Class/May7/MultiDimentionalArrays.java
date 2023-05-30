package Chapter1.Class.May7;

import java.util.Scanner;

public class MultiDimentionalArrays
{
    public static void main(String [] args)
    {
        int sizeOfArray;
        Scanner Reader = new Scanner(System.in);
        sizeOfArray = Reader.nextInt();
        int []array[] = new int[sizeOfArray][sizeOfArray];
        for(int i = 0 ; i < sizeOfArray ; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                array[i][j] = Reader.nextInt();
            }
        }


        for(int i = sizeOfArray - 1 ; i >= 0 ; i--)
        {
            for(int j = sizeOfArray - i - 1 ; j < sizeOfArray ; j++)
            {
                array[i][j] = 1;
            }
        }

        for(int i = 0 ; i < sizeOfArray ; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
