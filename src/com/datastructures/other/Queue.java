package com.datastructures.other;
import java.util.List;
import java.util.ArrayList;


public class Queue<T> {
    List<T> queue = new ArrayList<>();


    public T peek() {
        return queue.getFirst();
    }

    public T front() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enqueue(T data) {
        queue.addLast(data);
    }

    public T dequeue() {
        T firstElement = queue.getFirst();
        queue.remove(queue.indexOf(queue.getFirst()));
        return firstElement;
    }

    public int size() {
        return queue.size();
    }

    public int __len__() {
        return queue.size();
    }

    public void printQueueFormatted() {
        String formatted = "";

        for (int i = 0; i < queue.size(); i++) {
            formatted = formatted.concat(queue.get(i) + "-->");
        }
        System.out.println(formatted);
    }

    public void viewQueue() {
        System.out.println(queue);
    }

}