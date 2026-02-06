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
            return;
        }
        Node<T> last_node = this.head;
        while (last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = new_node;
    }

    public List<T> print_list() {
        Node<T> last_node = this.head;
        
        while (last_node != null) {
            nodes.add(last_node.data());
            last_node = last_node.next;
        }
        return nodes;
    }

    public void prepend(T data) {
        Node<T> new_node = new Node<>(data);
        new_node.next = this.head;
        this.head = new_node;
    }

    public void insert_after(Node<T> prev_node, T data) {
        if (prev_node == null) {
            System.out.println("Node cannot be null");
            return;
        }
        else {
            Node<T> new_node = new Node<>(data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }
    }

    public void delete_node(T node_to_delete) {
        Node<T> current_node = this.head;
        Node<T> prev_node = null;
        if (node_to_delete == null) {
            System.out.println("Node provided to delete does not exist");
            return;
        }
        else {
            if (current_node.data.equals(node_to_delete)) {
                this.head = current_node.next;
            }
            else {
                while (current_node != null && !current_node.data.equals(node_to_delete)) {
                    prev_node = current_node;
                    current_node = current_node.next;
                }
                if (current_node == null) {
                    return;
                }
                prev_node.next = current_node.next;

            }
        }
        
    }
}
