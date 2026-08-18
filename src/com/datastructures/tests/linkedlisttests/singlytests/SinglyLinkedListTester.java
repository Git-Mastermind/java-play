package com.datastructures.tests.linkedlisttests.singlytests;
import com.datastructures.linkedlist.singly.SinglyLinkedList;
import com.datastructures.linkedlist.singly.Node;

public class SinglyLinkedListTester {
    public static void main(String[] args) {
        Node<String> head = new Node<>("A", null);
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>(head);
        linkedList.append("B");
        linkedList.append("C");
        linkedList.append("D");
        Node<String> nodeB = linkedList.get(1);
        Node<String> nodeD = linkedList.get(3);
        linkedList.swap(nodeB, nodeD);
        linkedList.formattedPrint();


    }
}
