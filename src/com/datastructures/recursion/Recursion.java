package com.datastructures.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

    private Recursion() {

    }

    public static char uppercaseLetterInStringIterative(String str) {
        List<Character> listedStr = toArray(str);

        for (int i = 0; i < listedStr.size(); i++) {
            if (Character.isUpperCase(listedStr.get(i))) {
                return listedStr.get(i);
            }
        }
        return '0';
    }

    public static void uppercaseLetterInStringRecursive(String str, int index) {
        if (index == str.length() - 1) {
            System.out.println("No uppercase letters found");
            return;
        }
        if (Character.isUpperCase(str.charAt(index))) {
            System.out.println(str.charAt(index));
            return;
        }
        uppercaseLetterInStringRecursive(str, index + 1);

    }

    public static List<Character> toArray(String str) {
        List<Character> listedString = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            listedString.add(str.charAt(i));
        }
        return listedString;
    }

    public static int lengthOfStringIterative(String str) {
        List<Character> listedStr = toArray(str);
        int counter = 0;

        for (int i = 0; i < listedStr.size(); i++) {
            counter++;
        }
        return counter;
    }

    public static int lengthOfStringRecursive(String str, int index) {
        if (index == str.length() - 1) {
            return 1;
        }
        return 1 + lengthOfStringRecursive(str, ++index);
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

    public static int multiplyRecursive(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 + multiplyRecursive(num1, num2 - 1);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int lengthOfArray(List<Integer> array, int index) {
        if (index == array.size() - 1) {
            return 1;
        }
        return 1 + lengthOfArray(array, ++index);
    }

    public static boolean isHighest(List<Integer> array, int checkNum) {
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

    public static void countdown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countdown(--n);

    }

    public static int summation(int n) {
        if (n == 1) {
            return 1;
        }
        return n + summation(--n);
    }

    public static int lengthOfNumber(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + lengthOfNumber(num / 10);

    }

    // level 2

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static String reverseString(String str) {
        return reverseString(str, 0);
    }

    private static String reverseString(String str, int index) {
        if (index == str.length() - 1) {
            return "" + str.charAt(index);
        }
        return reverseString(str, index + 1) + str.charAt(index);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return true;
        }
        if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
            return false;
        }
        return isPalindrome(str, ++leftIndex, --rightIndex);
    }

    public static int reverseInt(int n) {
        int length = lengthOfNumber(n);
        int iterations = 0;
        return reverseInt(n, length, iterations);
    }

    public static int reverseInt(int n, int length, int iterations) {
        if (length == iterations) {
            return 0;
        }
        return concatenateInt((n % 10), reverseInt(n / 10, length, ++iterations));
    }

    public static int[] reverseIntUsingArray(int n) {
        int[] intArray = new int[lengthOfNumber(n)];
        int arrayLength = lengthOfNumber(n);

        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = n % 10;
            n /= 10;
        }

        return intArray;
    }

    public static int concatenateInt(int num1, int num2) {
        return (num1 * 10) + num2;
    }

    public static int[] convertNumberToDigits(final int numberOriginal) {
        int number = numberOriginal;
        int lengthOfNumber = lengthOfNumber(number);
        if (lengthOfNumber == 0) {
            lengthOfNumber = 1;
        }
        int[] digitsArray = new int[lengthOfNumber];

        for (int i = 1; i <= digitsArray.length; i++) {
            digitsArray[digitsArray.length - i] = number % 10;
            number /= 10;
        }

        return digitsArray;
    }

    public static List<Integer> convertNumberToDigitsArrayList(final int num) {
        int number = num;
        int lengthOfNumber = lengthOfNumber(number);
        List<Integer> digitsArray = new ArrayList<>();

        for (int i = 1; i <= lengthOfNumber; i++) {
            digitsArray.set(digitsArray.size() - 1, number % 10);
            number /= 10;
        }

        return digitsArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


}