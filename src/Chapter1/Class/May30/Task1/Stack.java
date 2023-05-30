package Chapter1.Class.May30.Task1;

import java.util.ArrayList;
import java.util.List;


public class Stack<T> {
    List<T>list = new ArrayList<>();
    void push(T t)
    {
        list.add(t);
    }
    void pop() throws NullPointerException
    {
        if(list.isEmpty()) throw new NullPointerException();
        else list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Tural");
        stack.push("Tural1");
        stack.push("Tural2");
        stack.pop();
        System.out.println(stack.list);
    }
}
