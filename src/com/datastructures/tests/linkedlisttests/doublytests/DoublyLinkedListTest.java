package com.datastructures.tests.linkedlisttests.doublytests;

import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.Node;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        Node<String> head = new Node<>("A");
        DoublyLinkedList<String> llist = new DoublyLinkedList<>(head);
        llist.prepend("B");
        llist.prepend("C");
        llist.printList();
    }
}
