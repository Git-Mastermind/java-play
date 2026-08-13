package com.datastructures.queue;
import java.util.List;
import java.util.ArrayList;


public class Queue<T> {
    List<T> queue = new ArrayList<>();

    public void append(T value) {
        queue.add(value);
    }

    public T peek() {
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public T poll() {
        if (this.size() == 0) {
            return null;
        }
        T head = queue.get(0);
        queue.remove(0);
        return head;
    }

    public boolean isEmpty() {
        return this.size()==0?true:false;
    }


    
}
