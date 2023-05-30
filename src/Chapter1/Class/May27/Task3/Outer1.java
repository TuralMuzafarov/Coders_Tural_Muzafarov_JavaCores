package May27.Task3;

import May27.Task2.Outer;

public class Outer1 {
    class Inner
    {
        void SayHello()
        {
            System.out.println("Hii!");
        }
    }

    void CallInner()
    {
        this.new Inner().SayHello();
    }

    public static void main(String[] args) {
        Outer1 out = new Outer1();
        out.CallInner();
    }


}
