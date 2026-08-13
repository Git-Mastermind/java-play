package com.datastructures.stack;
import java.util.List;
import java.util.ArrayList;


class Stack<T> {
    List<T> stack;
    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        T topElement = stack.get(stack.size() - 1);
        stack.remove(topElement);
        return topElement;
    }

    public T peek() {
        T topElement = stack.get(stack.size() - 1);
        return topElement;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }



}
