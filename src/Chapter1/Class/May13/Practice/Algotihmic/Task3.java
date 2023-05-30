package Chapter1.Class.May13.Practice.Algotihmic;
public class Task3 {
    public static int countInt(int[] arr , int target)
    {
        int count = 0;
        for(int i : arr)
        {
            if(i == target)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] array = {1,2,4,6,4,2,4,7,4,2,3,4,5,6};
        int max_count = 0;
        int maxElement = array[0];
        for(int i : array)
        {
            int count = Task3.countInt(array , i);
            if(count > max_count) {
                max_count = count;
                maxElement = i;
            }
        }
        System.out.println(maxElement);
    }
}
