package Chapter1.Class.June1.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String>list1 = new ArrayList<>();
        list1.add("tural");
        list1.add("tebriz");
        list1.add("ayxan");
        list1.add("orxan");
        list1.forEach(s-> System.out.println(s.toUpperCase()));
    }
}
