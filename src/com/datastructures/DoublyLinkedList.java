package com.datastructures;
import java.util.List;
import java.util.ArrayList;

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

    public void insertAfter(T data, Node<T> insert_after) {
        Node<T> current = this.head;

        while (current != insert_after) {
            current = current.next;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = insert_after.next;
        newNode.prev = insert_after;
        insert_after.next = newNode;
    }
    public void insertBefore(T data, Node<T> afterNode) {
        Node<T> current = this.head;
        Node<T> newNode = new Node<>(data);

        if (afterNode == this.head) {
            newNode.prev = null;
            newNode.next = this.head;
            this.head = newNode;
        }

        while (current.next != afterNode) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current = current.next.next;
        current.prev = newNode;  
    }

    public void deleteNode(T data) {
        Node<T> current = this.head;
        Node<T> previous = null;

        if (this.len() == 1) {
            this.head = null;
            return;
        }
        else {
            while (current.data != data) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
            current = current.next;
            current.prev = previous;
        }
    }

    public void reverse() {
        Node<T> current = this.head;

        while (current != null) {

        }
    }

    public void deDupe() {
        Node<T> current = this.head;
        List<T> uniqueElements = new ArrayList<>();

        while (current.next != null) {
            if (uniqueElements.contains(current.data)) {
                this.deleteNode(current.data);
            }
            else {
                uniqueElements.add(current.data);
            }
            current = current.next;
        }

    }

    public int len() {
        Node<T> current = this.head;
        int counter = 1;
        while (current.next != null) {
            counter ++;
            current = current.next;
        }

        return counter;
    }
    public void pairsWithSum(int sum) {
        Node<T> current= this.head;
        int nodeCount = 1;
        int incrementCounter = 1;

        while () {

        }
    } 
}
