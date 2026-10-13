package com.datastructures.tests.datastructurestests.stacktests;

import com.datastructures.stack.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stackTester = new Stack<>();
        
        String parenthesis = "{()()[}";
        System.out.println(stackTester.isParenthesisBalanced(parenthesis));
    } 
}

//"{{}{}{}{{}}}}}"
