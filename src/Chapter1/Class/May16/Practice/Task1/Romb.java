package Chapter1.Class.May16.Practice.Task1;

import java.util.Scanner;

public class Romb {
    protected static void printRomb(int size) {
        int spaces = size - 1;
        int stars = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = size * 2 - 3;


        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }

    }
    public static void main(String[] args) {
            int size_romb;
            size_romb = new Scanner(System.in).nextInt();
            Romb.printRomb(size_romb);

        }

    }

