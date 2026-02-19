package com.datastructures;
import java.util.List;
import java.util.ArrayList;


public class TestRunner {
    public static void main(String[] args) {
        ArrayProblems arrays = new ArrayProblems();
        List<Integer> nums = new ArrayList<>(List.of(310, 315, 275, 295, 260, 270, 290, 230, 255, 250));
        
        System.out.println(arrays.buySellStock(nums));

        
        
        
    }

    
}
