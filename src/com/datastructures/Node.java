package com.datastructures;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T data() {
        return data;
    }
}
