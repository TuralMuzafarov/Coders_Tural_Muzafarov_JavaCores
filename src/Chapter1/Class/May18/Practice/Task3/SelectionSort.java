package Chapter1.Class.May18.Practice.Task3;

public class SelectionSort {
    public void selection(int[] arr) {
        int size = arr.length;
        for (int i = 0; i <= size - 1; i++)
        {
            int min_index = i;
            for(int k = i + 1 ; k <= size - 1  ; k++)
            {
                if(arr[min_index] > arr[k])
                {
                    min_index = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }

}
