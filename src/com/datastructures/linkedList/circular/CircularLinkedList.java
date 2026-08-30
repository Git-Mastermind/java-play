package com.datastructures.linkedlist.circular;

public class CircularLinkedList<T> {
    private Node<T> head;

    public CircularLinkedList(Node<T> head) {
        this.head = head;
        this.head.next = this.head;
    }

    public int size() {
        Node<T> current = this.head;
        int counter = 1;

        if (current.next == null) {
            return counter;
        }
        while (current.next != this.head) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void append(T value) {
        Node<T> nodeToAppend = new Node<>(value, null);
        if (this.size() == 0) {
            this.head = nodeToAppend;
            nodeToAppend.next = nodeToAppend;
            return;
        }

        else if (this.size() == 1) {
            this.head.next = nodeToAppend;
            nodeToAppend.next = this.head;
            return;
        }
        Node<T> current = this.head;

        while (current.next != this.head) {
            current = current.next;
        }
        current.next = nodeToAppend;
        nodeToAppend.next = this.head;


    }

    public void formattedPrint() {
        Node<T> current = this.head;
        StringBuilder formattedPrint = new StringBuilder();

        while (current.next != this.head) {
            formattedPrint.append(current.data + " --> ");
            current = current.next;
        }
        formattedPrint.append(current.data + " --> back to head");
        System.out.println(formattedPrint);
    }

    public void prepend(T value) {
        Node<T> nodeToPrepend = new Node<>(value, this.head);

        if (this.size() == 0) {
            this.head = nodeToPrepend;
            nodeToPrepend.next = nodeToPrepend;
            return;
        }
        this.head.next = nodeToPrepend;
        nodeToPrepend.next = this.head;
        this.head = nodeToPrepend;
        System.out.println(this.head.data);

        

    }

}
