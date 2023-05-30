package Chapter1.Class.May13.Practice.Algotihmic;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str;
        str = new Scanner(System.in).nextLine();
        String[] arr = new String[50];
        arr = str.split(" ");
        int max = 0;
        int key = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i].length()) {
                max = arr[i].length();
                key = i;
            }
        }
        System.out.println("En uzun herfli soz: " + arr[key]);
    }
}
