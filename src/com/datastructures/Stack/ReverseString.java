package com.datastructures.stack;

public class ReverseString {
    private Stack<Character> stack;
    private String reversedString = "";

    public ReverseString() {
        stack = new Stack<>();
    }
    public String reverseString(String str) {
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i) + reversedString;
        }
        return reversedString;
    }
}
