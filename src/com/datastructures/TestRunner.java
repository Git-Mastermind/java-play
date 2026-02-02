package com.datastructures;
import java.util.*;
public class TestRunner {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        stack.push("A");
        stack.push("B");
        
        System.out.println(stack.pop());
        
        
    }
}
