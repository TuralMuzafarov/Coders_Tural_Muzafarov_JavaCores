package Chapter1.Class.May30.Task2;

public class PairClass<K,V> implements Pair{

    K key;
    V value;
    @Override
    public Object getKey() {
        return this.key;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        PairClass<String , Integer>object = new PairClass<>("Tural" , 15);
        System.out.println(object.getKey());
        System.out.println(object.getValue());


    }
}
