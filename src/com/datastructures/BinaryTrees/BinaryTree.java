package com.datastructures.binaryTrees;
// import java.util.List;
// import java.util.ArrayList;
import com.datastructures.other.Queue;



public class BinaryTree {
    Node root;
    
    public BinaryTree() {
        this.root = null;
    }

    public void search(int value) {
        Node root = this.root;
        int counter = 0;

        if (root.value > value) {
            root = root.left;
            counter ++;
        }
        else {
            root = root.right;
            counter ++;
        }
        System.out.println(counter);
        System.out.println(root.value);
    }
    

    

    
}

