package Chapter1.Class.June20.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean poliTest(String a)
    {
        int index = 0;
        while(index < a.length()/2)
        {
            if(a.charAt(index) == a.charAt(a.length()-index - 1)) index++;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(text);
        String[] list = text.split(" ");
        List<String>listPoli = new ArrayList<>();
        for(String a : list)
        {
            if(Main.poliTest(a)) listPoli.add(a);
        }
        System.out.println(listPoli);


    }
}
