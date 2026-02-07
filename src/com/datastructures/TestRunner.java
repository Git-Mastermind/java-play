package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        LinkedList<String> linkedListStr = new LinkedList<>();
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        LinkedList<Integer> llist = new LinkedList<>();

        linkedListStr.append("A");
        linkedListStr.append("B");
        linkedListStr.append("C");
        linkedListStr.append("D");
        linkedListStr.append("E");
        System.out.println(linkedListStr.nth_from_last(2));




    }
}
