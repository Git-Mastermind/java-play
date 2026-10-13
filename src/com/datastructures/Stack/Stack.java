package com.datastructures.stack;

import java.util.List;
import java.util.ArrayList;

public class Stack<T> {
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

    public int size() {
        return stack.size();
    }

    public boolean isEqual(Stack<T> inputStack) {
        if (inputStack.size() != this.size()) {
            return false;
        }
        for (int i = 0; i < this.size();) {
            if (inputStack.pop() != this.pop()) {
                return false;
            }
        }
        return true;
    }

    public boolean isCurlyBracesBalanced(String braces) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '{') {
                stack.push(braces.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isParenthesisBalanced(String parenthesis) {
        List<Character> openingParenthesis = new ArrayList<>(List.of('{', '(', '['));
        List<Character> closingParenthesis = new ArrayList<>(List.of('}', ')', ']'));
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (openingParenthesis.contains(parenthesis.charAt(i))) {
                stack.push(parenthesis.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;

    }

}
