package com.datastructures.tests.datastructurestests.linkedlisttests.doublytests;

import com.datastructures.linkedlist.doubly.DoublyLinkedList;
import com.datastructures.linkedlist.doubly.Node;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        Node<String> head = new Node<>("A");
        Node<Integer> intHead = new Node<>(1);
        DoublyLinkedList<Integer> llist = new DoublyLinkedList<>(intHead);
        llist.append(2);
        llist.append(3);
        llist.append(4);
        llist.append(5);
        
        llist.pairsThatAddToInt(5, intHead);

        // finish doublylinkedlist
    }
}
