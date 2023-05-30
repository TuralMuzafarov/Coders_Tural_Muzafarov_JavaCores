package Chapter1.Class.May18.Practice.Task3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,15,10,5,6};
        SelectionSort select = new SelectionSort();
        select.selection(arr);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
