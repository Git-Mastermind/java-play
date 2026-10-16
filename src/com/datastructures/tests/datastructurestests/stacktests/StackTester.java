package com.datastructures.tests.datastructurestests.stacktests;

import com.datastructures.stack.Stack;

public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stackTester = new Stack<>();

        String codeSnippet = "public static void {public void )}";
        System.out.println(stackTester.isCodeSnippetParenthesisBalanced(codeSnippet));
    }
}

// "{{}{}{}{{}}}}}"
