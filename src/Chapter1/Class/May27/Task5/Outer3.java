package May27.Task5;

public class Outer3 {
    interface inner
    {
        abstract void metot();
    }
    inner inner = new inner() {
        @Override
        public void metot() {
            System.out.println("Say Hi from anonymous class!");
        }
    };

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.inner.metot();
    }


}
