package com.datastructures;
import java.util.ArrayList;
import java.util.List;


public class LinkedList<T> {
    Node<T> head = null;
    List<T> nodes = new ArrayList<T>();

    public void append(T data) {
        Node<T> new_node = new Node<>(data);
        if (this.head == null) {
            this.head = new_node;
        }
        Node<T> last_node = this.head;
        while (last_node != null) {
            last_node = last_node.next;
        }
        last_node = new_node;
    }

    public List<T> print_list() {
        Node<T> last_node = this.head;
        
        while (last_node != null) {
            nodes.add(last_node.data);
            last_node = last_node.next;
        }
        return nodes;
    }
}
