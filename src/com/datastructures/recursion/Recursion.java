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

    public void uppercaseLetterInStringRecursive(String str, int index) {
        if (index == str.length() - 1) {
            System.out.println("No uppercase letters found");
            return;
        }
        if (Character.isUpperCase(str.charAt(index))) {
            System.out.println(str.charAt(index));
            return;
        }
        this.uppercaseLetterInStringRecursive(str, index + 1);

    }

    public List<Character> toArray(String str) {
        List<Character> listedString = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            listedString.add(str.charAt(i));
        }
        return listedString;
    }

    public int lengthOfStringIterative(String str) {
        List<Character> listedStr = this.toArray(str);
        int counter = 0;

        for (int i = 0; i < listedStr.size(); i++) {
            counter++;
        }
        return counter;
    }

    public int lengthOfStringRecursive(String str, int index) {
        if (index == str.length() - 1) {
            return 1;
        }
        return 1 + this.lengthOfStringRecursive(str, ++index);
    }

    public int findAllConsonentsIterative(String str) {
        List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        int consonentCounter = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(str.charAt(i))) {
                consonentCounter++;
            }
        }
        return consonentCounter;
    }
}