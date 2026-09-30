package com.datastructures.tests.datastructurestests.stringprocessingtests;

import com.datastructures.stringprocessing.StringProcessing;
import java.util.List;
import java.util.ArrayList;

public class StringProcessingTest {
    public void main(String[] args) {
        StringProcessing test = new StringProcessing();
        boolean result = test.isAnagram("rail safjey", "fairy tales");
        System.out.println(result);
    }
}
