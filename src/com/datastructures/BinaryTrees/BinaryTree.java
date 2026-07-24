package com.datastructures.BinaryTrees;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public String preOrder(Node root, String traversal) {

        traversal += String.valueOf(root.value) + "-";
        traversal = this.preOrder(root.left, traversal);
        traversal = this.preOrder(root.right, traversal);

        return traversal;
    }

    public String postOrder(Node root, String traversal) {
        traversal = this.preOrder(root.left, traversal);
        traversal = this.preOrder(root.right, traversal);
        traversal += String.valueOf(root.value);

        return traversal;
    }


}
