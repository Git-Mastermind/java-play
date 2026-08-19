package com.datastructures.linkedlist.circular;

public class CircularLinkedList<T> {
    private Node<T> head;

    public CircularLinkedList(Node<T> head) {
        this.head = head;
    }

    public int size() {
        Node<T> current = this.head;
        int counter = 1;

        while (current.next != this.head) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value, null);

        if (this.size() == 0) {
            this.head = newNode;
            return;
        }

        Node<T> current = this.head;
        while (current.next != this.head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = this.head;
    }

    public void formattedPrint() {
        Node<T> current = this.head;
        StringBuilder formattedLlist = new StringBuilder();

        while (current.next.next != this.head) {
            formattedLlist.append(current.data + " ---> ");
        }
        formattedLlist.append(current.data + "---> back to head");
    }

}
