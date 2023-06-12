package Chapter1.Class.June8.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("tural" , "muzafarov" , "coders", "java" , "bootcamp" , "technest" , "azasdadasd" , "abc");
        Stream<String>stream = list.stream();
        var filteredStream = stream.filter((x)->
        {
            int count = 0;
            boolean[] visited = new boolean[26];
            for(char a : x.toCharArray())
            {
                if(!visited[(int)a - (int)'a'])
                {
                    visited[(int)a - (int)'a'] = true;
                    count++;
                }
            }
            if(count > 3) return true;
            return false;
        });

        var take5stream = filteredStream.limit(5);
        var uppercaseStream = take5stream.map((x)->x.toUpperCase());
        uppercaseStream.forEach(System.out::println);



    }


    Predicate<String> a = (x)->
    {
        int count = 0;
        boolean[] visited = new boolean[26];
        for(char a : x.toCharArray())
        {
            if(!visited[a-'a']) {
                visited[a - 'a'] = true;
                count++;
            }
        }
        if(count > 3) return false;
        else return true;
    };

}
