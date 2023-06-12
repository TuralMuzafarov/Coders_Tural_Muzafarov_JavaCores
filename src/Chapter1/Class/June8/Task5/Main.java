package Chapter1.Class.June8.Task5;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var Randon = new Random();
        Stream<Integer> stream = Stream.generate(()->new Random().nextInt(1,101)).limit(100);
        Map<Integer , Long> map = stream.collect(Collectors.groupingBy((n)->n , Collectors.counting()));
        System.out.println(map);
    }
}
