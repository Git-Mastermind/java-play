package com.datastructures.stringprocessing;

import com.datastructures.recursion.Recursion;

import java.util.List;
import java.util.ArrayList;

public class StringProcessing {
    public boolean isPalindrome(String str) {
        List<Character> startPointerCollection = new ArrayList<>();
        List<Character> endPointerCollection = new ArrayList<>();
        int startPointerIndex = 0;
        char startPointer = str.charAt(0);
        int endPointerIndex = str.length() - 1;
        char endPointer = str.charAt(str.length() - 1);

        while (str.indexOf(startPointer) != str.indexOf(endPointer)) {
            startPointerCollection.add(startPointer);
            endPointerCollection.add(endPointer);

            startPointerIndex++;
            startPointer = str.charAt(startPointerIndex);

            endPointerIndex++;
            endPointer = str.charAt(endPointerIndex);
        }

        if (startPointerCollection.size() == endPointerCollection.size()) {
            for (int i = 0; i < startPointerCollection.size(); i++) {
                if (startPointerCollection.get(i) != endPointerCollection.get(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> findNextDigitsUsingLookAndSay(final int num) {
        int[] numArray = Recursion.convertNumberToDigits(num);
        List<Integer> nextNumInLookAndSaySequence = new ArrayList<>();

        int i = 0;
        int count = 1;

        while (i < numArray.length) {
            count = 1;
            while (i + 1 < numArray.length && numArray[i] == numArray[i + 1]) {
                i++;
                count++;
            }
            nextNumInLookAndSaySequence.add(count);
            nextNumInLookAndSaySequence.add(numArray[i]);
            i++;
        }
        return nextNumInLookAndSaySequence;
    }

    public boolean arrayContains(Character[] strArray, char charToFind) {
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == charToFind) {
                return true;
            }
        }
        return false;
    }

    public boolean arrayContains(List<Character> charArray, char charToFind) {
        for (int i = 0; i < charArray.size(); i++) {
            if (charArray.get(i) == charToFind) {
                return true;
            }
        }
        return false;
    }

    public boolean stringContains(String str, char charToFind) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToFind) {
                return true;
            }
        }
        return false;
    }

    public boolean isAnagram(final String firstStr, final String secondStr) {
        if (firstStr.length() != secondStr.length()) {
            return false;
        }
        String firstString = firstStr;
        String secondString = secondStr;

        for (int i = 0; i < secondString.length(); i++) {
            if (!this.stringContains(firstString, secondString.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnique(final String str) {
        String string = str;
        List<Character> uniqueLetters = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (this.arrayContains(uniqueLetters, string.charAt(i))) {
                return false;
            }
            uniqueLetters.add(string.charAt(i));
    }
    return true;

    }

    public String integerToString(final int num) {
        int number = num;
        return "" + number;
    }

    public int stringToInteger(final String str) {
        String string = str;
        int[] intArray = new int[string.length()];
        int resultingInt = 0;
        double maxPlaceValue = 10;

        for (int i = 0; i < string.length(); i++) {
            intArray[i] = string.charAt(i);
        }
        maxPlaceValue = Math.pow(10, intArray.length - 1);
        for (int i = 0; i < intArray.length; i++) {
            resultingInt += intArray[i] * maxPlaceValue;
            maxPlaceValue /= 10;
        }
        return resultingInt;
    }
}
