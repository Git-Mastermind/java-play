package com.datastructures;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Stack<T>  {
    private List<T> stack = new ArrayList<>();
    
    /**
     * adds input of defined type intoArrayList "stack"
     */
    public void push(T input) {
        stack.add(input);
    }

    /**
     * returns the first element in the stack, i.e. last element in the ArrayList "stack" and removes it as well
     */
    public T pop() {
        T first_element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return first_element;
    }

    /**
     * return the first element in the stack, i.e the last element in the ArrayList "stack" but doesn't remove it
     */
    public T peek() {
        return stack.get(stack.size() - 1);
    }

    /**
     * return true if the stack is empty, and false otherwise
     */
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * return the size of the stack
     */
    public int size() {
        return stack.size();
    }

    /**
     * returns the index in relation to stack format (i.e. last element in ArrayList is first element in stack) and returns -1 if is empty.
     */
    public int search(T item) {
        if (this.isEmpty()) {
            return -1;
        }
        int indexOfItem = stack.size() - stack.indexOf(item);
        return indexOfItem;
    }

    public boolean isMatch(String paren1, String paren2) {
        if (paren1.equals("(") && paren2.equals(")")) {
            return true;
        }
        if (paren1.equals("[") && paren2.equals("]")) {
            return true;
        }
        if (paren1.equals("{") && paren2.equals("}")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void is_parenthesis_balanced(String input_parenthesis) {
        int index = 0;
        String opening_parenthesis = "([{";
        char[] parenthesis = input_parenthesis.toCharArray();
        char current = parenthesis[index]
        while (index < input_parenthesis.length()) {
            if ()
        }
    }
}
