package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        CircularLinkedList<String> linkedList = new CircularLinkedList<>();
        
        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("C");
        linkedList.append("D");
        

        System.out.println(linkedList.josepheusCircle(2));
    }
}
