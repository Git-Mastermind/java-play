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

    public Node<T> get(T valueOfNode) {
        Node<T> current = this.head;

        while (current.data != valueOfNode) {
            current = current.next;
        }

        return current;
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

    public int size() {
        Node<T> current = this.head;
        int counter = 0;

        while (current.next != null) {
            counter++;
            current = current.next;
        }

        return counter;
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

    public void remove(T value) {
        Node<T> current = this.head;

        if (current.data == value) {
            this.head = current.next;
            return;
        }

        while (current.next.data != value) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void removeByPos(int index) {
        int indexCounter = 0;
        Node<T> current = this.head;

        while (indexCounter != index) {
            current = current.next;
            indexCounter++;
        }
        this.remove(current.data);
    }

    public void swap(T valueOfNodeToSwap, T valueToReplaceNodeToSwap) {
        Node<T> current = this.head;
        Node<T> nextNode = this.head;
        Node<T> previousNode = this.head;

        Node<T> nodeToSwap = this.get(valueOfNodeToSwap);
        Node<T> nodeToReplace = this.get(valueToReplaceNodeToSwap);

        if (nodeToSwap == nodeToReplace) {
            return;
        }

        while (current != nodeToSwap) {
            previousNode = current;
            nextNode = current.next;
            current = current.next;
        }
        Node<T> nextNode2 = this.head;
        Node<T> previousNode2 = null;
        current = this.head;

        while (current != nodeToReplace) {
            previousNode2 = current;
            nextNode2 = current.next;
            current = current.next;
        }

        Node<T> previousNode2Next = previousNode2.next;

        previousNode2.next = nextNode;
        previousNode.next = previousNode2Next.next;

    }

}