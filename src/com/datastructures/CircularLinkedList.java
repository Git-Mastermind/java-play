package com.datastructures;

public class CircularLinkedList<T> {
    Node<T> head = null;

    public void printList() {
        Node<T> current = this.head;
        String formatted = "";

        while (current.next != this.head) {
            formatted = formatted.concat(current.data + " ---> ");
            current = current.next;
        }
        formatted = formatted.concat(current.data.toString() + " ---> back to head");
        System.out.println(formatted);
    }
    
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current = this.head;
        if (this.head == null) {
            this.head = newNode;
            this.head.next = this.head;
        }
        else {
            while (current.next != this.head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = this.head;
        }
    }

}
