package Chapter1.Class.June1.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        Size s = (b) -> b.length();
        System.out.println(s.len(str));
    }
}
@FunctionalInterface
interface Size
{
    int len(String a);
}

