package Chapter1.Class.May23.Collections.Task4;
import  java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

                // Add elements to the list
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(1);


        Map<Integer, Integer> countMap = new HashMap<>();


        for (int element : list) {
            if (countMap.containsKey(element)) {
                int count = countMap.get(element);
                countMap.put(element, count + 1);
            } else {
                countMap.put(element, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            System.out.println("Element: " + element + ", Count: " + count);
        }
    }
}



