package com.datastructures.binarytrees;

import com.datastructures.queue.Queue;
import com.datastructures.stack.Stack;

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

        while (queue.size() >= 1) {
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

    public StringBuilder reverseLevelOrderTraversal() {
        Queue<T> queue = new Queue<>();
        Stack<T> stack = new Stack<>();

        Node<T> node = new Node<>(null);
        StringBuilder traversalNotebook = new StringBuilder();

        queue.append(this.root.value);

        while (queue.size() >= 1) {
            node.value = queue.peek();
            stack.push(queue.poll());

            if (node.right != null) {
                queue.append(node.right.value);
            }
            if (node.left != null) {
                queue.append(node.left.value);
            }
        }
        while (stack.size() != 0) {
            traversalNotebook.append(stack.pop() + " - ");
        }
        return traversalNotebook;
    }

    public int height(Node<T> node) {
        if (node == null) {
            return -1;
        }
        int left_height = this.height(node.left);
        int right_height = this.height(node.right);
        if (left_height >= right_height) {
            return 1 + left_height;
        }
        return 1 + right_height;
    }

    public int size() {
        Node<T> node = new Node<>(null);
        Queue<T> queue = new Queue<>();
        queue.append(this.root.value);

        int counter = 0;

        while (queue.size() >= 1) {
            node.value = queue.peek();
            counter++;

            if (node.left != null) {
                queue.append(node.left.value);
            }
            if (node.right != null) {
                queue.append(node.right.value);
            }
        }
        return counter;
    }
}
