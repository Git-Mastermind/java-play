package com.datastructures.tests.datastructurestests.stringprocessingtests;

import com.datastructures.stringprocessing.StringProcessing;

public class StringProcessingTest {
    public void main(String[] args) {
        StringProcessing test = new StringProcessing();
        String str = "palindrome";
        boolean result = test.isPalindrome(str);
        System.out.println(result);
    }
}
