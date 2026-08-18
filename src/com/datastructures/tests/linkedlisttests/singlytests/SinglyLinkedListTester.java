package com.datastructures.tests.linkedlisttests.singlytests;
import com.datastructures.linkedlist.singly.SinglyLinkedList;
import com.datastructures.linkedlist.singly.Node;

public class SinglyLinkedListTester {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1, null);
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>(head);
        linkedList.append(4);
        linkedList.append(8);
        linkedList.append(4);
        linkedList.append(2);
        int occurances = linkedList.countOccurances(4);
        System.out.println(occurances);

        



    }
}
