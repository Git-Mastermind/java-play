package com.datastructures.stack;

import java.util.HashMap;
import java.util.Map;

public class DetermineBracketBalance {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> map = new HashMap<>();

    public DetermineBracketBalance() {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

    }

    public boolean determineBracketBalance(String brackets) {
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[') {
                stack.push(brackets.charAt(i));
            }
            else {
                if (stack.pop() == map.get(brackets.charAt(i))) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
