package com.datastructures.JavaBookExercises;

import java.util.ArrayList;

public class CodeMagnets {
    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        arrayList.add(0, "zero");
        arrayList.add(1, "one");
        arrayList.add(2, "two");
        arrayList.add(3, "three");
        printList(arrayList);

        if (arrayList.contains("three")) {
            arrayList.add("four");
        }
        arrayList.remove(2);
        printList(arrayList);

        if (arrayList.indexOf("four") != 4) {
            arrayList.add("4.2");
        }
        printList(arrayList);
        printList(arrayList);
    }

    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
