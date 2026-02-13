package com.datastructures;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class LinkedList<T> {
    Node<T> head = null;
    
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

    public void append_int(Integer data) {
        Node<Integer> new_node = new Node<>(data);
        if (this.int_head == null) {
            this.int_head = new_node;
            return;
        }
        Node<Integer> last_node = this.int_head;
        while (last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = new_node;
    }

    public void print_list() {
        ArrayList<T> nodes = new ArrayList<T>();
        Node<T> last_node = this.head;
        String formatted_statement = "";
        
        while (last_node != null) {
            nodes.add(last_node.data());
            last_node = last_node.next;
        }
        for (int i = 0; i < nodes.size(); i++) {
            if (i == 0) {
                formatted_statement = formatted_statement.concat(String.valueOf(nodes.get(i)));
                formatted_statement = formatted_statement.concat(" ");
            }
            else {
                formatted_statement = formatted_statement.concat("---> ");
                formatted_statement = formatted_statement.concat(String.valueOf(nodes.get(i)));
            }
            i++;
        }
        System.out.println(formatted_statement);
    }

    public void print_list_noformat() {
        ArrayList<T> nodes = new ArrayList<>();
        Node<T> current = this.head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        // System.out.println(nodes);
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
        int counter = 1;

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
        Node<Integer> new_head = null;

        if (p != null && q != null) {
            if (p.data == q.data) {
                s = p;
                new_head = p;
                p = s.next;
                
            }
            else if (p.data < q.data) {
                s = p;
                new_head = s;
                p = s.next;
                
            }
            else if (p.data > q.data) {
                s = q;
                new_head = s;
                q = s.next;
                
            }
        }

        if (p == null || q == null) {
            return s;
        }
        else {
            while (p != null && q != null) {
                if (p.data < q.data) {
                    s.next = p;
                    p = p.next;
                    }
                else if (p.data > q.data) {
                    s.next = q;
                    q = q.next;
                    }
                s = s.next;
            }
            
        }
        return new_head;
        
    }

    public void de_dupe() {
        ArrayList<T> unique_elements = new ArrayList<>();
        Node<T> current = this.head;
        Node<T> prev = null;

        while (current != null) {
            if (unique_elements.contains(current.data)) {
                prev.next = current.next;
            }
            else {
                unique_elements.add(current.data);
            }
            prev = current;
            current = current.next;
        }

    }

    public T nth_from_last(int n) {
        Node<T> current = this.head;
        int index = this.len_iter() - n;
        int counter = 1;

        while (counter != index) {
            current = current.next;
            counter += 1;
        }
        return current.data;


    }

    public int count_occurences(T input_data) {
        Node<T> current = this.head;
        int counter = 0;

        while (current != null) {
            if (current.data == input_data) {
                counter += 1;
            }
            current = current.next;
        }
        return counter;
    }

    public boolean is_palindrome(Node<T> llist1, Node<T> llist2) {
        ArrayList<T> llist1_values = new ArrayList<>();
        ArrayList<T> llist2_values = new ArrayList<>();
        Node<T> current = llist1;
        boolean is_palindrome = false;


        while (current != null) {
            llist1_values.add(current.data);
            current = current.next;
        }
        current = llist2;

        while (current != null) {
            llist2_values.add(current.data);
            current = current.next;
        }

        if (llist1_values.equals(llist2_values)) {
            is_palindrome = true;
        }
        
        return is_palindrome;
    }

    public void tail_to_head() {
        Node<T> head = this.head;
        Node<T> current = this.head;
        Node<T> prev = null;
        Node<T> second_to_last = null;

        while (current.next.next != null) {
            second_to_last = current;
            prev = current.next;
            current = current.next.next;
        }
        prev.next = head.next;
        second_to_last.next = null; 
    }
}
