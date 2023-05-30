package Chapter1.Class.May20;

public class MaxNumber {
    protected static int MaxNum(int[] arr , int first_index  , int first_number)
    {
        if(first_index == arr.length - 1) return first_number;
        if(arr[first_index + 1] > first_number)
        {
            first_number = arr[first_index + 1];
            first_index = first_index+1;
            return MaxNum(arr , first_index , first_number);
        }else
        {
            first_index = first_index + 1;
            return  MaxNum(arr  , first_index , first_number);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,35,4,5};
        System.out.println(MaxNum(arr , 0 , arr[0]));
    }

}
