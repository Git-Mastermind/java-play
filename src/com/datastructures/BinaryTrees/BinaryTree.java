package com.datastructures.binaryTrees;
// import java.util.List;
// import java.util.ArrayList;
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

    public String levelOrderTraversalHelper(Node<T> start) {
        Queue<T> queue = new Queue<>();
        String traversal = "";
        queue.enqueue(start.value);

        while (queue.size() > 0) {
            traversal = traversal.concat(queue.dequeue().toString());

            if (start.left != null) {
                queue.enqueue(start.left.value);
            }
            if (start.right != null) {
                queue.enqueue(start.right.value);
            }
            traversal = traversal.concat(queue.dequeue().toString());
        }
        return traversal;
    }
    

    

    
}
