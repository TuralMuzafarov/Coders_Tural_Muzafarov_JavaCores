package Chapter1.Class.May16.Practice.Task3;

public class Duzbucaqli extends AbstractShape{
    private int en;
    private int uzunluq;
    public Duzbucaqli(int en , int uzunluq)
    {
        this.en = en;
        this.uzunluq = uzunluq;
    }

    @Override
    protected int getPerimetr() {
        return 2*(this.en+this.uzunluq);
    }

    @Override
    protected int getSahe() {
        return this.en*this.uzunluq;
    }
}
