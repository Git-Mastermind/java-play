package com.datastructures.binarytrees;

public class Node<T> {
    Node<T> root;
    Node<T> right;
    Node<T> left;

    public Node(Node<T> root) {
        this.root = root;
        this.right = null;
        this.left = null;
    }
}
