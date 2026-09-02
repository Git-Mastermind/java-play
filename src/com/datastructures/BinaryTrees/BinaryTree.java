package com.datastructures.binarytrees;

import com.datastructures.queue.Queue;

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

    public StringBuilder levelOrderTraversal() {

        Node<T> node = new Node<>(null);
        Queue<T> queue = new Queue<>();
        queue.append(this.root.value);
        StringBuilder traversalNotebook = new StringBuilder();

        while (queue.size() >= 1){
            node.value = queue.peek();
            traversalNotebook.append(queue.poll() + " - ");
        

            if (node.left != null) {
                queue.append(node.left.value);
            }
            if (node.right != null) {
                queue.append(node.right.value);
            }
        }
        return traversalNotebook;
            
    }
}
