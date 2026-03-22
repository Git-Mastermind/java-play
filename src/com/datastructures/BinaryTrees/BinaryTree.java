package com.datastructures.binaryTrees;
// import java.util.List;
// import java.util.ArrayList;
import com.datastructures.other.Queue;



public class BinaryTree {
    Node root;
    
    public BinaryTree() {
        this.root = null;
    }

    public void preOrder(int data) {
        Node node = new Node(data);
        preOrderHelper(node);
    }

    public void preOrderHelper(Node node) {
        if (node == null) return;
        System.out.println(node.value + " ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }
    

    

    
}

