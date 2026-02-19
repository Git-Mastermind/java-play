package com.datastructures;
import java.util.List;
import java.lang.Math;
// import java.util.ArrayList;

public class ArrayProblems {
    
    public void arrayAdvanceGame(List<Integer> nums) {
        int furthest_reached = 0;
        int last_index = nums.size() - 1;

        for (int i = 0; i < nums.size(); i++) {
            if (i > furthest_reached) {
                break;
            }
            furthest_reached = Math.max(furthest_reached, nums.get(i) + i);
        }
        
        if (furthest_reached >= last_index) {
            System.out.println("Win!");
        }
        else {
            System.out.println("Unwinnible!");
        }
    }

    public void shortestWorkTime(List<Integer> times) {
        for (int i = 0; )
    } 

    
}
