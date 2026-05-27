package com.datastructures.linkedList.singlyReview;
import java.util.ArrayList;

public class SinglyLinkedListReview<T> {
    Node<T> head;

    public SinglyLinkedListReview(T data) {
        this.head.data = data;
        this.head.next = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void printList() {
        String list = "";
        Node<T> current = this.head;

        while (current.next != null) {
            list = list.concat(current.data.toString());
        }
        list = list.concat("null");
        System.out.println(list);
    }
}