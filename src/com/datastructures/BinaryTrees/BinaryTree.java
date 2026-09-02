package com.datastructures.binarytrees;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public StringBuilder preOrder(StringBuilder traversalNotebook, Node<T> currentNode) {
        if (currentNode != null) {
            traversalNotebook.append(currentNode.value + " --> ");
            this.preOrder(traversalNotebook, currentNode.left);
            this.preOrder(traversalNotebook, currentNode.right);
        }
        return traversalNotebook;
    }

    public StringBuilder postOrder(StringBuilder traversalNotebook, Node<T> currentNode) {
        if (currentNode != null) {
            this.postOrder(traversalNotebook, currentNode.left);
            this.postOrder(traversalNotebook, currentNode.right);
            traversalNotebook.append(currentNode.value + " --> ");
        }
        return traversalNotebook;
    }
}
