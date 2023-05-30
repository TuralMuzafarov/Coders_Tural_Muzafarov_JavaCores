package Chapter1.Class.May9;
import  java.util.Random;

public class Math {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(10);
        System.out.println(i);
        int i_= rand.nextInt(10) + 30; // values between 30 , 40
        System.out.println(i_);

        new Math().sum(5,7); // we did not add access modifier to it . because of this we should call
        // this method by creating our objects



    }
    void sum(int a , int b)
    {
        System.out.println(a+b);
    }

}
