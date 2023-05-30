package Chapter1.Class.May9.Practice;

import java.util.Random;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
     new  Task1().GuessGame( 10 , 20);
    }
    public void GuessGame(int bound1 , int bound2)
    {
        int guess;
        System.out.println("Guess a number: ");
        Scanner read = new Scanner(System.in);
        guess = read.nextInt();
        int answer = new Random().nextInt(Math.abs(bound2 - bound1)+ bound1);
        if(guess == answer)
        {
            System.out.println("Answer was " + answer);
            System.out.println("You won");
        }
        else
        {
            System.out.println("Answer was " + answer);
            System.out.println("You lost");
        }
    }

}
