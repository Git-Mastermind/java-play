package com.datastructures.Stack;
import java.util.List;
import java.util.ArrayList;
public class Stack<T> {
    List<T> stack = new ArrayList<>();

    public void push(T value) {
        stack.add(value);
    }

    public boolean isEmpty() {
        return stack.size()==0?true:false;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public T pop() {
        T valueToReturn = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return valueToReturn;
    }

    public int search(T valueToSearch) {
        return stack.indexOf(valueToSearch) + 1;
    }
    



}
