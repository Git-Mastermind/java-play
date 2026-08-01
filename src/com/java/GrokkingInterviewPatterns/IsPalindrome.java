package com.java.GrokkingInterviewPatterns;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {

    public List<String> removeSpaces(String word) {
        String[] array = word.split("");
        List<String> sentence = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i <= sentence.size() - 1; i++) {
            if (sentence.get(i).equals(" ")) {
                sentence.remove(i);
            }
        }
        return sentence;
    }


    public boolean isPalindrome(String word) {
        List<String> sentence = this.removeSpaces(word);

        String leftPointer = sentence.get(0);
        String rightPointer = sentence.get(sentence.size() - 1);
        int leftCurrentIndex = 0;
        int rightCurrentIndex = sentence.size() - 1;

        while (leftPointer.equals(rightPointer)) {
            if (leftCurrentIndex == sentence.size() - 1 && rightCurrentIndex == 0) {
                return true;
            }
            leftCurrentIndex++;
            rightCurrentIndex--;

            leftPointer = sentence.get(leftCurrentIndex);
            rightPointer = sentence.get(rightCurrentIndex);
        }
        return false;

    }
}
