package com.datastructures.tests.datastructurestests.stacktests;

import com.datastructures.stack.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack2.push(1);
        stack2.push(9);
        stack2.push(1);

        System.out.println(stack1.isEqual(stack2));
        
    } 
}

//"{{}{}{}{{}}}}}"
