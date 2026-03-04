package com.datastructures.binaryTrees;
import java.util.List;
import java.util.ArrayList;
import com.datastructures.other.Queue;



public class BinaryTree<T> {
    Node<T> root;
    
    public BinaryTree() {
        this.root = null;
    }

    public void levelOrderTraversal(T data) {
        
    }

    public void levelOrderHelper(Node<T> start) {
        Queue<T> queue = new Queue<>();
        String traversalData = "";
        queue.enqueue(start);
        while (queue.size() > 0) {
            
        }
    }

    

    
}
