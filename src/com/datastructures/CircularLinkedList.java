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

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current = this.head;

        while (current.next != this.head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = this.head;
        this.head = newNode;
    } 

    public void remove(T value) {
        Node<T> current = this.head;
        Node<T> previous = null;

        if (value == this.head.data) {
            while (current.next != this.head) {
                current = current.next;
            }
            current.next = this.head.next;
            this.head = this.head.next;
            return;
        }

        while (current.data != value) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;  

    }

}
