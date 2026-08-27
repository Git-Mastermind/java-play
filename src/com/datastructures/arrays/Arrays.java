package com.datastructures.arrays;
import java.util.List;
import java.util.ArrayList;

public class Arrays<T> {
    private List<T> array = new ArrayList<>();

    public void append(T value) {
        array.add(value);
    }
    public void print() {
        System.out.println(array);
    }

    public int size() {
        return array.size();
    }

    public void twoSum(int sum) {
        int index = 0;
        StringBuilder pairsOfSums = new StringBuilder();

        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < this.size(); j++) {
                if (i + j == sum) {
                    pairsOfSums.append("(" + i + ", " + j + ")");
                }
            }
        }
        System.out.println(pairsOfSums);
    } 
}
