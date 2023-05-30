package Chapter1.Class.May30.Task3;

public class Find{
    public static <T extends Comparable<T>> T findmax(T[] array)
    {
        if(array.length == 0)
        {
            throw new IllegalArgumentException();
        }
        T max = array[0];
        for(int i = 1 ; i < array.length ; i++)
        {
            if(array[i].compareTo(max) > 0)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        Integer[] arr = {2,1,4,5,6,1,0,15};
        String[] arr = {"TUR", "AL" , "QWER", "TUWEIR"};
        System.out.println(Find.findmax(arr));

    }


}
