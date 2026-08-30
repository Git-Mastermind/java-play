package com.datastructures.arrays;
import java.util.List;
import java.util.ArrayList;

public class Arrays {
    private Integer[] array;

    public Arrays(int size) {
        array = new Integer[size];
    }

    public void append(Integer value) {
        int i = 0;
        while (array[i] != null) {
            i++;
        }
        array[i] = value;
    }
    public void print() {
        StringBuilder formattedArray = new StringBuilder();
        formattedArray.append("[");
        for (int i = 0; i < array.length; i++) {
            formattedArray.append(array[i] + ", ");
        }
        formattedArray.append("]");
        System.out.println(formattedArray);
    }

    public int size() {
        return array.length;
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

    public void addOne() {
        
    }
}
