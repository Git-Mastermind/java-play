package com.datastructures.tests.datastructurestests.binarytreetests;
import com.datastructures.binarytrees.BinaryTree;
import com.datastructures.binarytrees.Node;


public class BinaryTreeTest {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        BinaryTree<Integer> tree = new BinaryTree<>(root);

        StringBuilder traversalNotebook = new StringBuilder();
        StringBuilder treePrinted = tree.postOrder(traversalNotebook, root);
        System.out.println(treePrinted);
    }
        
        
}
