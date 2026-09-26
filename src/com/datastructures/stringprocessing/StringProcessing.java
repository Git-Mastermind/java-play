package com.datastructures.stringprocessing;

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
                if (startPointerCollection.get(i) != endPointerCollection.get(i)){
                    return false;
                }            
            }
            return true;
        }
        else {
            return false;
        }

        
        
    }
}
