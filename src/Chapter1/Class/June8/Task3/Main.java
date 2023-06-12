package Chapter1.Class.June8.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Tural", "Muzafarov", 20, "Group A"),
                new Student("Ali", "Gasimli", 22, "Group B"),
                new Student("Muxtar", "Murtuzov", 21, "Group A"),
                new Student("Cefer", "Guliyev", 23, "Group B"),
                new Student("Ravan", "Mikayilov", 20, "Group A")
        );

        Map<String, List<String>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getGroupName,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        groupedStudents.forEach((groupName, names) -> {
            System.out.println("Group: " + groupName);
            System.out.println("Students: " + names);
            System.out.println();
        });
    }
}

class Student {
    private String name;
    private String surname;
    private int age;
    private String groupName;

    public Student(String name, String surname, int age, String groupName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGroupName() {
        return groupName;
    }
}


