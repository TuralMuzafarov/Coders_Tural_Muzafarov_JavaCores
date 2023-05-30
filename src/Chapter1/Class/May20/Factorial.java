package Chapter1.Class.May20;

public class Factorial {
    protected static int factorial(int number)
    {
        if(number == 0 ) return 1;
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));
    }
}
