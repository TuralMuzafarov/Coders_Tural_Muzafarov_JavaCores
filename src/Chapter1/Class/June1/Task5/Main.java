package Chapter1.Class.June1.Task5;
import java.util.ArrayList;
import java.util.List;

public class Main {
    void printEven(List<Integer>list , select select)
    {
        for(Integer entity  : list)
        {
            if(select.selectEven(entity))
            {
                System.out.println(entity);
            }
        }
    }

    public static void main(String[] args) {
        select a = (int j) ->
        {
            if(j % 2 == 0) return  true;
            else return false;
        };
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++)
        {
            list.add(i);
        }
        new Main().printEven(list , a);
    }

}

interface select
{
    boolean selectEven(int a);
}


