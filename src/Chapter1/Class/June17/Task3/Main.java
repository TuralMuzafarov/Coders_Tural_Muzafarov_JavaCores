package Chapter1.Class.June17.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character operator = new Scanner(System.in).next().charAt(0);
        switch (operator)
        {
            case '+':
            {
                double num1 = new Scanner(System.in).nextDouble();
                double num2 = new Scanner(System.in).nextDouble();
                System.out.println(num1 + num2);
                break;
            }
            case '-':
            {
                double num1 = new Scanner(System.in).nextDouble();
                double num2 = new Scanner(System.in).nextDouble();
                System.out.println(num1 - num2);
                break;
            }
            case '*':
            {
                double num1 = new Scanner(System.in).nextDouble();
                double num2 = new Scanner(System.in).nextDouble();
                System.out.println(num1 * num2);
            }
            case '/':
            {
                double num1 = new Scanner(System.in).nextDouble();
                double num2 = new Scanner(System.in).nextDouble();
                System.out.println(num1 / num2);
                break;
            }

        }
    }
}
