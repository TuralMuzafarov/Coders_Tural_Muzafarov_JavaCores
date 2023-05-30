package Chapter1.Class.May7;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.abs;

public class AngleBetweenHourAndMin {
    public static void main(String [] args)
    {
        int hour , min;
        Scanner Reader = new Scanner(System.in);
        System.out.println("Saati daxil edin: ");
        hour = Reader.nextInt();
        System.out.println("Deqiqeni daxil edin: ");
        min = Reader.nextInt();
        System.out.println("Aralarindaki iti bucaq: ");
        double answer;
        if(hour >= 12)  answer = abs ( (abs(12 - hour) *  60 + min) * 0.5  - min * 6 );
        else   answer = abs ( (abs(hour) *  60 + min) * 0.5  - min * 6 );
        System.out.println(answer);
    }

}
