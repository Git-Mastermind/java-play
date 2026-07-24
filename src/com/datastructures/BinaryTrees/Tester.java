package com.datastructures.BinaryTrees;
import com.datastructures.Queue.Queue;
import com.datastructures.Stack.Stack;

public class Tester {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.search(2));    
    }
    
    
}
