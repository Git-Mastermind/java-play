package com.datastructures.other;
import java.util.List;
import java.util.ArrayList;


public class Queue<T> {
    List<T> queue = new ArrayList<>();


    public T peek() {
        return queue.getLast();
    }

    public T front() {
        return queue.getLast();
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
        queue.addFirst(data);
    }

    public int size() {
        return queue.size();
    }

    public int __len__() {
        return queue.size();
    }

    public void view() {
        String formatted = "";

        for (int i = 0; i < queue.size(); i++) {
            formatted.concat(queue.get(i).toString() + "-->");
        }
        System.out.println(formatted);
    }

}