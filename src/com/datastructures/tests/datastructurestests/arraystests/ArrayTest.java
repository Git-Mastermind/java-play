package com.datastructures.tests.datastructurestests.arraystests;
import com.datastructures.arrays.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Arrays<Integer> array = new Arrays<>();
        array.append(1);
        array.append(2);
        array.append(3);
        array.append(4);
        array.append(5);
        array.append(6);
        array.append(7);
        array.append(8);

        array.twoSum(5);
    }
}
