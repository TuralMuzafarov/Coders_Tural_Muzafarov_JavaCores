package Chapter1.Class.June8.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student>list = new ArrayList<>();
        list.add(new Student(15 , "Tural"));
        list.add(new Student(17 , "Akif"));
        list.add(new Student(19, "Alican"));
        Optional<Student> max = list.stream().max((a,b)->a.age-b.age);
        System.out.println(max.get().name);
    }


}
