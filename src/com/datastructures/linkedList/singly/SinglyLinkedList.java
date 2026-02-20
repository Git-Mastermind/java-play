package com.datastructures.linkedList.singly;
import java.util.ArrayList;


public class SinglyLinkedList<T> {
    Node<T> head = null;
    
    Node<Integer> intHead = null;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node<T> lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void appendInt(Integer data) {
        Node<Integer> new_node = new Node<>(data);
        if (this.intHead == null) {
            this.intHead = new_node;
            return;
        }
        Node<Integer> last_node = this.intHead;
        while (last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = new_node;
    }

    public void printList() {
        ArrayList<T> nodes = new ArrayList<T>();
        Node<T> lastNode = this.head;
        String formattedStatement = "";
        
        while (lastNode != null) {
            nodes.add(lastNode.data);
            lastNode = lastNode.next;
        }
        for (int i = 0; i < nodes.size(); i++) {
            if (i == 0) {
                formattedStatement = formattedStatement.concat(String.valueOf(nodes.get(i)));
                formattedStatement = formattedStatement.concat(" ");
            }
            else {
                formattedStatement = formattedStatement.concat("---> ");
                formattedStatement = formattedStatement.concat(String.valueOf(nodes.get(i)));
            }
            i++;
        }
        System.out.println(formattedStatement);
    }

    public void printListNoformat() {
        ArrayList<T> nodes = new ArrayList<>();
        Node<T> current = this.head;

        while (current != null) {
            nodes.add(current.data);
            current = current.next;
        }
        System.out.println(nodes);
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) {
            System.out.println("Node cannot be null");
            return;
        }
        else {
            Node<T> newNode = new Node<>(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void delete_node(T nodeToDelete) {
        Node<T> currentNode = this.head;
        Node<T> prevNode = null;
        if (nodeToDelete == null) {
            System.out.println("Node provided to delete does not exist");
            return;
        }
        else {
            if (currentNode.data.equals(nodeToDelete)) {
                this.head = currentNode.next;
            }
            else {
                while (currentNode != null && !currentNode.data.equals(nodeToDelete)) {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
                if (currentNode == null) {
                    return;
                }
                prevNode.next = currentNode.next;

            }
        }
        
    }

    public void deleteNodeByPos(int pos) {
        Node<T> currentNode = this.head;
        Node<T> prevNode = null;
        int index = 0;
        if (pos == 0) {
            this.head = currentNode.next;
        } 
        else {
            while (currentNode != null && index < pos) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                index += 1;
            }
            prevNode.next = currentNode.next;
        }
    }

    public int lenIter() {
        Node<T> currentNode = this.head;
        int counter = 1;

        while (currentNode != null) {
            counter += 1;
            currentNode = currentNode.next;
        }

        return counter;
    }

    public int lenRecur(Node<T> node) {
        if (node.next == null) {
            return 1;
        }
        else {
            return 1 + this.lenRecur(node.next);
        }
    }

    public void swapNode(T firstNode, T secondNode) {
        Node<T> curr1 = this.head;
        Node<T> curr2 = this.head;
        Node<T> prevNode1 = null;
        Node<T> prevNode2 = null;
        if (firstNode == secondNode) {
            return;
        }
        while (curr1 != null && curr1 != firstNode) {
            prevNode1 = curr1;
            curr1 = curr1.next;
        }
        
        while (curr2 != null && curr2 != secondNode) {
            prevNode2 = curr2;
            curr2 = curr2.next;
        }

        if (prevNode1 != null) {
            prevNode1 = curr2;
        }
        else {
            curr1 = this.head;
        }
        if (prevNode2 != null) {
            prevNode2 = curr1;
        }
        else {
            curr2 = this.head;
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

    public Node<Integer> mergeSorted(Node<Integer> llist) {
        Node<Integer> p = this.intHead;
        Node<Integer> q = llist;
        Node<Integer> s = null;
        Node<Integer> newHead = null;

        if (p != null && q != null) {
            if (p.data == q.data) {
                s = p;
                newHead = p;
                p = s.next;
                
            }
            else if (p.data < q.data) {
                s = p;
                newHead = s;
                p = s.next;
                
            }
            else if (p.data > q.data) {
                s = q;
                newHead = s;
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
        return newHead;
        
    }

    public void deDupe() {
        ArrayList<T> uniqueElements = new ArrayList<>();
        Node<T> current = this.head;
        Node<T> prev = null;

        while (current != null) {
            if (uniqueElements.contains(current.data)) {
                prev.next = current.next;
            }
            else {
                uniqueElements.add(current.data);
            }
            prev = current;
            current = current.next;
        }

    }

    public T nthFromLast(int n) {
        Node<T> current = this.head;
        int index = this.lenIter() - n;
        int counter = 1;

        while (counter != index) {
            current = current.next;
            counter += 1;
        }
        return current.data;


    }

    public int countOccurences(T input_data) {
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

    public boolean isPalindrome(Node<T> llist1, Node<T> llist2) {
        ArrayList<T> llist1_values = new ArrayList<>();
        ArrayList<T> llist2_values = new ArrayList<>();
        Node<T> current = llist1;
        boolean isPalindrome = false;


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
            isPalindrome = true;
        }
        
        return isPalindrome;
    }

    public void tailToHead() {
        Node<T> head = this.head;
        Node<T> current = this.head;
        Node<T> prev = null;
        Node<T> secondToLast = null;

        while (current.next.next != null) {
            secondToLast = current;
            prev = current.next;
            current = current.next.next;
        }
        prev.next = head.next;
        secondToLast.next = null; 
    }

    public T halfTwoPointerMethod() {
        Node<T> current = this.head;
        Node<T> counter = this.head;

        while (counter.next != null) {
            counter = counter.next.next;
            current = current.next;
            if (counter == null) {
                break;
            }
        }

        return current.data;
    }
}
