package Chapter1.Class.May23.Collections.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer>List1 = new ArrayList<>();
        ArrayList<Integer>List2 = new ArrayList<>();
        ArrayList<Integer>Union = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++)
        {
            List1.add(new Random().nextInt(10));
            List2.add(new Random().nextInt(10));
        }

        System.out.println("List1 : ");
        System.out.println(List1);
        System.out.println("List2 : ");
        System.out.println(List2);
        for(int i : List1)
        {
            Union.add(i);
        }
        for(int i : List2)
        {
            Union.add(i);
        }

        for(int i = 0 ; i < Union.size() ; i++)
        {
            int min_index = i;
            for(int k = i ; k < Union.size() ; k++)
            {
                if(Union.get(k) < Union.get(min_index))
                {
                    min_index = k;
                }
            }
            Collections.swap(Union , min_index , i);
        }
        System.out.println(Union);
    }
}
