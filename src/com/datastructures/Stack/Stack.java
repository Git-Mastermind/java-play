package com.datastructures.stack;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Stack<T> {
    List<T> stack;
    final static List<Character> OPENING_PARENTHESIS = List.of('{', '(', '[');
    final static Map<Character, Character> MAP_OF_PARENTHESIS = new HashMap<>();
    static {
        MAP_OF_PARENTHESIS.put('}', '{');
        MAP_OF_PARENTHESIS.put(')', '(');
        MAP_OF_PARENTHESIS.put(']', '[');
    }

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
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (OPENING_PARENTHESIS.contains(parenthesis.charAt(i))) {
                stack.push(parenthesis.charAt(i));
            } else {
                if (stack.size() == 0 || stack.pop() != MAP_OF_PARENTHESIS.get(parenthesis.charAt(i))) {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;

    }

}
