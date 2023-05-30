package Chapter1.Class.May23.Collections.Task2;

import java.util.List;
import  java.util.LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>List1 = new LinkedList<>();
        LinkedList<Integer>List2 = new LinkedList<>();
        for(int i = 0 ; i < 10 ; i++)
        {
            List1.add(new Random().nextInt(10));
            List2.add(new Random().nextInt(10));
        }
        System.out.println("List1");
        for(int i : List1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("List2");
        for(int i : List2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        LinkedList<Integer> Intersection = new LinkedList<>();
        for(int i : List1)
        {
            if(List1.contains(i) && List2.contains(i) && !Intersection.contains(i))
            {
                Intersection.add(i);
            }
        }

        System.out.println("Intersection");
        for(int i : Intersection)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Union");

        LinkedList<Integer>Union = new LinkedList<>();

        for(int i : List1)
        {
            Union.add(i);
        }

        for(int k : List2)
        {
            if(!Union.contains(k))
            {
                Union.add(k);
            }
        }

        for(int k : Union)
        {
            System.out.print(k + " ");
        }
        System.out.println();
    }

}
