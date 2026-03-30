package com.datastructures.binaryTrees;
// import java.util.List;
// import java.util.ArrayList;
import com.datastructures.other.Queue;



public class BinaryTree {
    Node root;
    
    public BinaryTree() {
        this.root = null;
    }

    public String preOrder(int data) {
        Node node = new Node(data);
        String traversalNotebook = "";
        String traversalRecord = preOrderHelper(node, traversalNotebook);
        return traversalRecord;
    }

    public String preOrderHelper(Node node, String traversalNotebook) {
        if (node == null) {
            return traversalNotebook;
        }
        traversalNotebook = traversalNotebook.concat(Integer.toString(node.value));
        traversalNotebook = preOrderHelper(node.left, traversalNotebook);
        traversalNotebook = preOrderHelper(node.right, traversalNotebook);
        return traversalNotebook;
        
    }
    

    

    
}

