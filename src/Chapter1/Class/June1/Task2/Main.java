package Chapter1.Class.June1.Task2;

public class Main {
    public static void main(String[] args) {
        factorial a = (int c) ->
        {
            int sum = 1;
            for(int i = 1 ; i <= c ; i++)
            {
                sum *= i;
            }
            return sum;
        };


        System.out.println(a.factoriall(5));

    }



}
interface factorial
{
    int factoriall(int a);
}
