package com.datastructures.linkedlist.doubly;

public class DoublyLinkedList<T> {
    private Node<T> head;

    public DoublyLinkedList(Node<T> head) {
        this.head = head;
    }

    public int size() {
        Node<T> current = this.head;
        int counter = 1;

        if (this.head == null) {
            return 0;
        }
        
        while (current.next != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    public void printList() {
        Node<T> current = this.head;
        StringBuilder formattedPrint = new StringBuilder();

        if (this.size() == 0) {
            System.out.println("--> null");
            return;
        }
        formattedPrint.append("null --> ");

        while (current.next != null) {
            formattedPrint.append(current.data + " --> ");
            current = current.next;
        }
        formattedPrint.append(current.data + " --> null");
        System.out.println(formattedPrint);
    }

    public void append(T value) {
        Node<T> current = this.head;
        Node<T> nodeToAppend = new Node<>(value);

        if (this.size() == 0) {
            this.head = nodeToAppend;
            nodeToAppend.next = null;
            nodeToAppend.prev = null;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAppend;
        nodeToAppend.prev = current;
    }

    public void prepend(T value) {
        Node<T> current = this.head;
        Node<T> nodeToPrepend = new Node<>(value);

        if (this.size() == 0) {
            this.head = nodeToPrepend;
            nodeToPrepend.next = null;
            nodeToPrepend.prev = null;
            return;
        }

        nodeToPrepend.next = this.head;
        nodeToPrepend.prev = null;
        this.head = nodeToPrepend;
    }

    public Node<T> get(T value) {
        Node<T> current = this.head;

        if (this.size() == 0) {
            return null;
        }

        while (current.data != value) {
            current = current.next;
        }
        return current;
    }

    public void insertAfter(T valueToInsert, Node<T> insertAfter) {
        Node<T> current = this.head;
        Node<T> newNode = new Node<>(valueToInsert);

        if (this.size() == 0) {
            this.head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return;
        }

        while (current != insertAfter) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
        current.next.next.prev = newNode;


    }
}
