package com.java.GrokkingInterviewPatterns;

public class Tester {
    public static void main(String[] args) {
        IsPalindrome palindromeObj = new IsPalindrome();
        boolean isPalindrome = palindromeObj.isPalindrome("wsfgf");
        System.out.println(isPalindrome);
    }
}
