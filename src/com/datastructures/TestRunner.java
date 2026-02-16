package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();
        

        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("B");
        linkedList.append("C");
        linkedList.append("D");

        linkedList.deDupe();
        linkedList.printList();
        
    }

    
}
