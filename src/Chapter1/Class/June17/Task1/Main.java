package Chapter1.Class.June17.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("4 reqemli ededi daxil edin: ");
        int n = new Scanner(System.in).nextInt();
        int newN = (n - ((n/1000)*1000) - (n%10)) + (n/1000) + (n%10)*1000;
        System.out.println(newN);
    }
}
