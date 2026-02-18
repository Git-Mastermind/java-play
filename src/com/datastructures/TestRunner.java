package com.datastructures;
import java.util.List;
import java.util.ArrayList;


public class TestRunner {
    public static void main(String[] args) {
        ArrayProblems arrays = new ArrayProblems();
        List<Integer> nums = new ArrayList<>(List.of(3,2,0,0,2,0,1));
        

        arrays.arrayAdvanceGame(nums);
        
        
    }

    
}
