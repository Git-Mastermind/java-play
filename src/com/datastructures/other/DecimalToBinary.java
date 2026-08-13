package com.datastructures.other;

import com.datastructures.stack.Stack;

public class DecimalToBinary {
    Stack<Integer> stack = new Stack<>();

    public void decimalToBinary(int decimalNum) {
        if (decimalNum == 0) {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
            return;
        }
        if (decimalNum % 2 == 0) {
            stack.push(0);
            
        }
        else {
            stack.push(1);
        }
        decimalToBinary(decimalNum / 2);

    }
}
