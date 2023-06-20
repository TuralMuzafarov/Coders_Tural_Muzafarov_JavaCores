package Chapter1.Class.June20.Task2;

import java.util.*;

public class Main {
    static boolean AnagramTest(String a , String b)
    {
        char[] sequence1 = a.toCharArray();
        Arrays.sort(sequence1);
        char[] sequence2 = b.toCharArray();
        Arrays.sort(sequence2);
        if(Arrays.equals(sequence1, sequence2)) return  true;
        else return false;
    }
    public static void main(String[] args) {
        String txt = new Scanner(System.in).nextLine();
        String[] words = txt.split(" ");
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < words.length ; i++)
        {
            for(int j = i+1 ; j < words.length ; j++)
            {
                int flag = 0;
                if(Main.AnagramTest(words[i] , words[j]))
                {
                    set.add(words[j]);
                    flag = 1 ;
                }
                if(flag == 1 ) set.add(words[i]);
            }
        }
        set.forEach(System.out::println);
    }
}
