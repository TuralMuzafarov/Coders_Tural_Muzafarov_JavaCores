package Chapter1.Class.June17.Task4;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5, 7, 2, 4, 6, 8};
        List<List<Integer>> mySets = new ArrayList<>();
        for(int i = 0 ; i < array.length ; i++)
        {
            List<Integer>innerList = new ArrayList<>();
            innerList.add(array[i]);
            for(int j = i+1 ; j < array.length ;j++)
            {
                if(array[j] > array[j-1]) innerList.add(array[j]);
                else break;
            }
            mySets.add(innerList);
        }

        int max = 0;
        int maxIndex = 0;
        for(int i = 0 ; i < mySets.size();i++)
        {
            if(mySets.get(i).size() > max)
            {
                max = mySets.get(i).size();
                maxIndex = i;
            }
        }

        System.out.println(mySets.get(maxIndex));
    }
}
