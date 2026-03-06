package com.datastructures.binaryTrees;
import java.util.List;
import java.util.ArrayList;
import com.datastructures.other.Queue;



public class BinaryTree<T> {
    Node<T> root;
    
    public BinaryTree() {
        this.root = null;
    }

    public void levelOrderTraversal(T start) {
        Node<T> startNode = new Node<>(start);
        levelOrderTraversalHelper(startNode);
    }

    public void levelOrderTraversalHelper(Node<T> start) {
        
    }
    

    

    
}
