package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();
        SinglyLinkedList<String> sLinkedList = new SinglyLinkedList<>();

        sLinkedList.append("A");
        sLinkedList.append("B");
        sLinkedList.append("C");
        sLinkedList.append("D");
        System.out.println(sLinkedList.half_pointer_method());
        
    }

    
}
