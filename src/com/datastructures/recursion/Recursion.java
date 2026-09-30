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

    public int multiplyRecursive(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 + this.multiplyRecursive(num1, num2 - 1);
    }

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * this.factorial(num - 1);
    }

    public int lengthOfArray(List<Integer> array, int index) {
        if (index == array.size() - 1) {
            return 1;
        }
        return 1 + this.lengthOfArray(array, ++index);
    }

    public boolean isHighest(List<Integer> array, int checkNum) {
        int tempHighest = 0;
        for (int num : array) {
            if (num > tempHighest) {
                tempHighest = num;
            }
        }

        return checkNum >= tempHighest;
    }

    // practice problems

    // level 1

    public void countdown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        this.countdown(--n);

    }

    public int summation(int n) {
        if (n == 1) {
            return 1;
        }
        return n + this.summation(--n);
    }

    public int lengthOfNumber(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + this.lengthOfNumber(num / 10);

    }

    // level 2

    public int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + this.digitSum(n / 10);
    }

    public String reverseString(String str) {
        return reverseString(str, 0);
    }

    private String reverseString(String str, int index) {
        if (index == str.length() - 1) {
            return "" + str.charAt(index);
        }
        return this.reverseString(str, index + 1) + str.charAt(index);
    }

    public boolean isPalindrome(String str) {
        return this.isPalindrome(str, 0, str.length() - 1);
    }

    public boolean isPalindrome(String str, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return true;
        }
        if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
            return false;
        }
        return isPalindrome(str, ++leftIndex, --rightIndex);
    }

    public int reverseInt(int n) {
        int length = this.lengthOfNumber(n);
        int iterations = 0;
        return this.reverseInt(n, length, iterations);
    }

    public int reverseInt(int n, int length, int iterations) {
        if (length == iterations) {
            return 0;
        }
        return this.concatenateInt((n % 10), this.reverseInt(n / 10, length, ++iterations));
    }

    public int[] reverseIntUsingArray(int n) {
        int[] intArray = new int[this.lengthOfNumber(n)];
        int arrayLength = this.lengthOfNumber(n);

        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = n % 10;
            n /= 10;
        }

        return intArray;
    }

    public int concatenateInt(int num1, int num2) {
        return (num1 * 10) + num2;
    }

    public int[] convertNumberToDigits(final int numberOriginal) {
        int number = numberOriginal;
        int[] digitsArray = new int[this.lengthOfNumber(number)];

        for (int i = 1; i <= digitsArray.length; i++) {
            digitsArray[digitsArray.length - i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }

    public List<Integer> convertNumberToDigitsArrayList(final int num) {
        int number = num;
        int lengthOfNumber = this.lengthOfNumber(number);
        List<Integer> digitsArray = new ArrayList<>();

        for (int i = 1; i <= lengthOfNumber; i++) {
            digitsArray.set(digitsArray.size() - 1, number % 10);
            number /= 10;
        }

        return digitsArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


}