package com.implementations;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Stack<T>  {
    private List<T> stack = new ArrayList<>();
    
    /**
     * 
     */
    public void push(T input) {
        stack.add(input);
    }

    /**
     * 
     */
    public T pop() {
        T first_element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return first_element;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        return stack.size();
    }

    public int search(T item) {
        if (this.isEmpty()) {
            return -1;
        }
        int indexOfItem = stack.size() - stack.indexOf(item);
        return indexOfItem;
    }
}
