package com.datastructures.linkedlist.circular;

public class CircularLinkedList<T> {
    private Node<T> head;

    public CircularLinkedList(Node<T> head) {
        this.head = head;
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
        Node<T> nodeToAppend = new Node<>(value, this.head);
        if (this.size() == 0) {
            this.head = nodeToAppend;
            return;
        }

        else if (this.size() == 1) {
            this.head.next = nodeToAppend;
            return;
        }
        Node<T> current = this.head;

        while (current.next != this.head) {
            current = current.next;
        }
        current.next = nodeToAppend;
        
    }

    public void formattedPrint() {
        Node<T> current = this.head;
        StringBuilder formattedLlist = new StringBuilder();

        while (current.next.next != this.head) {
            formattedLlist.append(current.data + " ---> ");
            current = current.next;
        }
        formattedLlist.append(current.data + " ---> head");
        System.out.println(formattedLlist);
    }

}
