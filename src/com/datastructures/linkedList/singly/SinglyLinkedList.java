package com.datastructures.linkedlist.singly;
import java.util.List;
import java.util.ArrayList;

public class SinglyLinkedList<T> {
    Node<T> head;
    List<T> linkedList = new ArrayList<>();


    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }

    public int size() {
        return linkedList.size();
    }

    public void formattedPrint() {
        String linkedListFormatted = "";
        Node<T> current = this.head;

        while (current.next != null) {
            linkedListFormatted = linkedListFormatted + " " + current.data + " ---> ";
            current = current.next;
        }
        linkedListFormatted = linkedListFormatted + " " + current.data + " ---> null";
        System.out.println(linkedListFormatted);

    }


    public void append(T dataForNode) {
        Node<T> nodeToAppend = new Node<>(dataForNode, null);
        Node<T> current = this.head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAppend;
    }
}
