package Collections.Task1;


import java.util.*;
import java.util.Collection;
import  java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(7);
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : list)
        {
            hashSet.add(i);
        }
        list.clear();
        for(int i : hashSet)
        {
            list.add(i);
        }
        for(int i : list)
        {
            System.out.println(i);
        }

    }



}
