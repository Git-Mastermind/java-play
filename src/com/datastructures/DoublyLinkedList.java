package com.datastructures;

public class DoublyLinkedList<T> {
    Node<T> head = null;

    public void printList() {
        Node<T> current = this.head;
        String formatted = "";
        formatted = formatted.concat(" NULL <--- " + current.data + "---> ");
        if (current.next == null) {
            return;
        }
        
        current = current.next;
        while (current.next != null) {
            formatted = formatted.concat("<---" + current.data + " ---> ");
            current = current.next;
        }
        formatted = formatted.concat("<---" + current.data.toString() + " ---> NULL");
        System.out.println(formatted);
    }


    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return;
        }
        else {
            Node<T> current = this.head;
            while (current.next != null) {
            current = current.next;
            }
            newNode.next = null;
            newNode.prev = current;
            current.next = newNode;

        }

    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        newNode.prev = null;
        this.head = newNode;
    }
}
