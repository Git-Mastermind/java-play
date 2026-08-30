package com.datastructures.tests.datastructurestests.linkedlisttests.circulartests;

import com.datastructures.linkedlist.circular.CircularLinkedList;
import com.datastructures.linkedlist.circular.Node;

public class CircularLinkedListTest {
    public static void main(String[] args) {
        Node<String> head = new Node<>("A", null);
        CircularLinkedList<String> llist = new CircularLinkedList<>(head);
        llist.append("B");
        llist.append("C");
        llist.append("D");
        llist.append("E");
        llist.formattedPrint();
    }
}
