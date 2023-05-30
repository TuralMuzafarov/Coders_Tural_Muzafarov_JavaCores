package Chapter1.Class.May9.Practice;

import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(age >= 3 && age <= 100)
            this.age = age;
        else {
            System.out.println("Yas uygun deyil yeniden daxil edin: ");
            this.age = new Scanner(System.in).nextInt();
        }
    }

    private Boolean inputTest(String input)
    {
        for(int i = 0 ; i < input.length() ; i++)
        {
            if((int)input.charAt(i) > 32 && (int)input.charAt(i) <65 || (int)input.charAt(i) > 90 && (int)input.charAt(i) < 97 || (int)input.charAt(i) > 122 && (int)input.charAt(i) < 127 )
                return false;
        }
        return true;
    }

    private Boolean ageTest(int age)
    {
        if(age <= 3 || age >= 100) return false;
        else return true;
    }



    public User(String name , String surname , int age)
    {
//        if(!ageTest(age))
//        {
//            System.out.println("Yaş 3 və 100 araliğinda olmalidir!!! Yaşı yenidən daxil edin:");
//            age = new Scanner(System.in).nextInt();
//        }
        if(!inputTest(name))
        {
            System.out.println("Adda simbol ola bilmez. Yeniden daxil edin: ");
            name = new Scanner(System.in).nextLine();
        }
        if(!inputTest(surname))
        {
            System.out.println("Soyadda simbol ola bilmez. Yeniden daxil edin: ");
            surname = new Scanner(System.in).nextLine();
        }
        setAge(age);
        setName(name);
        setSurname(surname);
    }


}
