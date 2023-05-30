package Chapter1.Class.May20;

public class ElementCemi {

    protected  static int sum(int[] arr , int size) {
        if(size == 0) return 0;
        size = size - 1;
        return arr[size] + sum(arr , size);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(sum(arr , 6));
    }
}
