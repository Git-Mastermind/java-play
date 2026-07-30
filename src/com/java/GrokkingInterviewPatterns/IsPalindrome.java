package com.java.GrokkingInterviewPatterns;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {
    public void isPalindrome(String word) {
        String[] strArray = word.split("");
        List<String> str = new ArrayList<>(Arrays.asList(strArray));

        System.out.println(str);
    }
}
