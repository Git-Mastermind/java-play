package com.datastructures.tests;

import com.datastructures.stack.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(1);

        Integer topElement = stack.pop();
        System.out.println(topElement);

        topElement = stack.peek();
        System.out.println(topElement);
    }
}
