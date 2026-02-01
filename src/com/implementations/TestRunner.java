package com.implementations;
import java.util.*;
public class TestRunner {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<Object>();
        Scanner scanner = new Scanner(System.in);

        stack.push("A");
        stack.push("B");
        
        System.out.println(stack.pop());
        
        
    }
}
