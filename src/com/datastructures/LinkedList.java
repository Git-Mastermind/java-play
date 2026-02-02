package com.datastructures;

public class LinkedList<T> {
    T head;

    public LinkedList(T head) {
        this.head = head;
    }

    public void append(T data) {
        Node<T> new_node = new Node<>(data);
    }
}
