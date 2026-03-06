package com.datastructures.other;
import java.util.List;
import java.util.ArrayList;
import com.datastructures.binaryTrees.Node;

public class Queue<T> {
    List<T> queueValues = new ArrayList<>();
    List<Node<T>> queueNodes = new ArrayList<>();


    public T peek() {
        return queueValues.getFirst();
    }

    public T front() {
        return queueValues.getFirst();
    }

    public boolean isEmpty() {
        if (queueValues.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enqueue(T data) {
        queueValues.addLast(data);
    }

    public void enqueueNode(Node<T> node) {
        queueNodes.addLast(node);
    } 

    public T dequeue() {
        T firstElement = queueValues.getFirst();
        queueValues.remove(queueValues.indexOf(queueValues.getFirst()));
        return firstElement;
    }


    public int size() {
        return queueValues.size();
    }

    public int __len__() {
        return queueValues.size();
    }

    public void printQueueFormatted() {
        String formatted = "";

        for (int i = 0; i < queueValues.size(); i++) {
            formatted = formatted.concat(queueValues.get(i) + "-->");
        }
        System.out.println(formatted);
    }

    public void viewQueue() {
        System.out.println(queueValues);
    }

}