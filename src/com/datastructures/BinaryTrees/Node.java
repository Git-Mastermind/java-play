package com.datastructures.binarytrees;

public class Node<T> {
    T value;
    Node<T> right;
    Node<T> left;

    public Node(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
