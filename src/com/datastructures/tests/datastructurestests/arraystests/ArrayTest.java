package com.datastructures.tests.datastructurestests.arraystests;
import com.datastructures.arrays.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Arrays array = new Arrays(5);
        array.append(1);
        array.append(2);
        array.append(3);
        array.append(4);
    

        array.print();
    }
}
