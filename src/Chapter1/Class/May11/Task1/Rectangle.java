package Chapter1.Class.May11.Task1;

public class Rectangle {
    double width;
    double height;
    public Rectangle(double width , double height)
    {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double sideLength)
    {
        this(sideLength , sideLength);
    }

}
