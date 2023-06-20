package Chapter1.Class.June20.Task3;

import javax.naming.PartialResultException;

public class ReverseArray {
    static <T> void  reverse(T[] array   , int start , int end)
    {
        if(start >= end) return;
        T temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverse(array, start+1 , end - 1);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        ReverseArray.reverse(arr , 0 , arr.length - 1);
        for (int i = 0 ; i < arr.length ; i++) System.out.println(arr[i]);
    }

}
