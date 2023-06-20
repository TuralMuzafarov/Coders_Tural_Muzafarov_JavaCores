package Chapter1.Class.June20.Task4;

public class Car {
    public  String brand;
    public Engine engine;
    public Car(int horsepower , String brand)
    {
        this.engine = new Engine(horsepower);
        this.brand = brand;
    }
}
