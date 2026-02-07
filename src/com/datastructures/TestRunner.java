package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        LinkedList<String> linkedListStr = new LinkedList<>();
        LinkedList<String> linkedListStr2 = new LinkedList<>();
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        LinkedList<Integer> llist = new LinkedList<>();

        linkedListStr.append("A");
        linkedListStr.append("B");
        linkedListStr.append("C");
        linkedListStr.append("D");

        linkedListStr2.append("A");
        linkedListStr2.append("B");
        linkedListStr2.append("C");
        linkedListStr2.append("C");

        System.out.println(linkedListStr.is_palindrome(linkedListStr.head, linkedListStr2.head));





    }
}
