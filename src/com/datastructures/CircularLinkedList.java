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
    public int len() {
        int counter = 1;
        Node<T> current = this.head;
        
        while (current.next != this.head) {
            counter ++;
            current = current.next;
        }
        return counter;
    }

    public void splitList() {
        Node<T> current = this.head;
        Node<T> previous = null;
        int counter = 0;

        while (current != null && counter < (this.len() / 2)) {
            previous  = current;
            current = current.next;
            counter ++;
        }
        previous.next = this.head;

        CircularLinkedList<T> second_llist = new CircularLinkedList<>();
        
        while (current.next != this.head) {
            second_llist.append(current.data);
            current = current.next;
        }
        second_llist.append(current.data);
        this.printList();
        second_llist.printList();
    }

    public T josepheusCircle(int step) {
        Node<T> current = this.head;
        Node<T> previous = current;
        int stepCounter = 1;
        int nodeCounter = this.len();

        while (nodeCounter != 1) {
            if (stepCounter == step) {
                this.remove(current.data);
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
            nodeCounter --;
            stepCounter = 1;
        }

        return current.data;

    }

}
