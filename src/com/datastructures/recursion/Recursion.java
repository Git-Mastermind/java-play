package com.datastructures.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public char uppercaseLetterInStringIterative(String str) {
        List<Character> listedStr = this.toArray(str);

        for (int i = 0; i < listedStr.size(); i++) {
            if (Character.isUpperCase(listedStr.get(i))) {
                return listedStr.get(i);
            }
        }
        return '0';
    }

    public List<Character> toArray(String str) {
        List<Character> listedString = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            listedString.add(str.charAt(i));
        }
        return listedString;
    }
}