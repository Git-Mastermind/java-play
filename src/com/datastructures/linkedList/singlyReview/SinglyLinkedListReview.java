package com.datastructures.linkedList.singlyReview;
import java.util.ArrayList;

public class SinglyLinkedListReview<T> {
    private Node<T> head = null;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
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

        while (current != null) {
            list = list.concat(current.data.toString());
            list = list.concat(" ----> ");
            current = current.next;
        }
        list = list.concat("null");
        System.out.println(list);
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfter(T data, T insertAfter) {
        Node<T> current = this.head;

        while (current.next != null) {
            if (current.data == insertAfter) {
                break;
            }
            current = current.next;
        }
        if (current != insertAfter) {
            System.out.println("Node to insert after not found in linked list");
            return;
        }

        Node<T> newNode = new Node<>(data);

        current = this.head;

        while (current.data != insertAfter) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        
    }
}