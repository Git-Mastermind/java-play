package com.datastructures.tests.datastructurestests.stacktests;

import com.datastructures.stack.ReverseString;

public class ReverseStringTester {
    public static void main(String[] args) {
        ReverseString tester = new ReverseString();
        String stringToReverse = "buhtig no em wollof siht ees nac uoy fi";
        String reversedString = tester.reverseString(stringToReverse);
        System.out.println(reversedString);
    }
}
