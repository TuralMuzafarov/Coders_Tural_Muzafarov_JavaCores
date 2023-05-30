package Chapter1.Class.May16.Practice.Task3;

public class Kvatrat extends AbstractShape{
    private int teref;

    public Kvatrat(int teref)
    {
        this.teref = teref;
    }

    @Override
    protected int getPerimetr() {
        return 4*this.teref;
    }

    @Override
    protected int getSahe() {
        return this.teref*this.teref;
    }
}
