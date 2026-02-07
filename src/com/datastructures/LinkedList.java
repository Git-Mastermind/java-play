package com.datastructures;
import java.util.ArrayList;
import java.util.List;


public class LinkedList<T> {
    Node<T> head = null;
    List<T> nodes = new ArrayList<T>();
    Node<Integer> int_head = null;

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

    public void print_list() {
        Node<T> last_node = this.head;
        
        while (last_node != null) {
            nodes.add(last_node.data());
            last_node = last_node.next;
        }
        System.out.println(nodes);
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

    public void delete_node_by_pos(int pos) {
        Node<T> current_node = this.head;
        Node<T> prev_node = null;
        int index = 0;
        if (pos == 0) {
            this.head = current_node.next;
        } 
        else {
            while (current_node != null && index < pos) {
                prev_node = current_node;
                current_node = current_node.next;
                index += 1;
            }
            prev_node.next = current_node.next;
        }
    }

    public int len_iter() {
        Node<T> current_node = this.head;
        int counter = 0;

        while (current_node != null) {
            counter += 1;
            current_node = current_node.next;
        }

        return counter;
    }

    public int len_recur(Node<T> node) {
        if (node.next == null) {
            return 1;
        }
        else {
            return 1 + this.len_recur(node.next);
        }
    }

    public void swap_node(T first_node, T second_node) {
        Node<T> curr_1 = this.head;
        Node<T> curr_2 = this.head;
        Node<T> prev_node_1 = null;
        Node<T> prev_node_2 = null;
        if (first_node == second_node) {
            return;
        }
        while (curr_1 != null && curr_1 != first_node) {
            prev_node_1 = curr_1;
            curr_1 = curr_1.next;
        }
        
        while (curr_2 != null && curr_2 != second_node) {
            prev_node_2 = curr_2;
            curr_2 = curr_2.next;
        }

        if (prev_node_1 != null) {
            prev_node_1 = curr_2;
        }
        else {
            curr_1 = this.head;
        }
        if (prev_node_2 != null) {
            prev_node_2 = curr_1;
        }
        else {
            curr_2 = this.head;
        }

    }
    
    public void reverse() {
        Node<T> prev = null;
        Node<T> next = null;
        Node<T> current = this.head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public Node<Integer> merge_sorted(Node<Integer> llist) {
        Node<Integer> p = this.int_head;
        Node<Integer> q = llist;
        Node<Integer> s = null;

        if (p == null || q == null) {
            return s;
        }
        else {
            while (p != null && q != null) {
            if (p.data < q.data) {
                s = p;
                p = s.next;
                }
            else if (p.data > q.data) {
                s = q;
                q = s.next;
                }
            }
        }
        return s;
        
    }

}
