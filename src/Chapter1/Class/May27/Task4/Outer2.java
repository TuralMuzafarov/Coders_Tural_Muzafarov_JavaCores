package May27.Task4;

import May27.Task2.Outer;

public class Outer2 {
    static class Inner
    {
        void SayHello()
        {
            System.out.println("Hi!!");
        }

    }

    public static void main(String[] args) {

        Outer2.Inner inner = new Outer2.Inner();
        inner.SayHello();
    }

}
