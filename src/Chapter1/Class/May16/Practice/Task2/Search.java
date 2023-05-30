package Chapter1.Class.May16.Practice.Task2;

import java.util.Scanner;

public class Search {
    protected  static int BinarySearch(int size , int[] arr , int key)
    {
        int left = 0 ;
        int right = size - 1;
        int mid;
        int answer = -1;
        while(left <= right)
        {
            mid = (left+right)/2;
            if(arr[mid] == key)
            {
                answer = mid;
                break;
            }
            if(arr[mid] < key)
            {
                left = mid + 1;
            }
            if(arr[mid] > key)
            {
                right = mid - 1;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        int[] arr = {10,11,16,17,15,16,19,20,25,30};

        int key;
        System.out.println("Enter the key: ");
        key = new Scanner(System.in).nextInt();
        System.out.println(Search.BinarySearch(10 , arr , key));


    }



}
