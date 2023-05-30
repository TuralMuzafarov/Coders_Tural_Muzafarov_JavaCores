package May27.Task2;

public class Outer {
    public class Inner
    {
        static void SayHello()
        {
            System.out.println("Hello from Inner Class");
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner.SayHello();
    }
}
