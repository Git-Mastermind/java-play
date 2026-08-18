package com.datastructures.linkedlist.singly;
import java.util.List;
import java.util.ArrayList;


public class SinglyLinkedList<T> {
    private Node<T> head;


    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }

    public int size() {
        int counter = 1;
        Node<T> current = this.head;

        while (current.next != null) {
            counter += 1;
            current = current.next;
        }
        return counter;
    }

    private boolean linkedListIsEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    public void formattedPrint() {
        String linkedListFormatted = "";
        Node<T> current = this.head;

        while (current.next != null) {
            linkedListFormatted = linkedListFormatted + " " + current.data + " ---> ";
            current = current.next;
        }
        linkedListFormatted = linkedListFormatted + " " + current.data + " ---> null";
        System.out.println(linkedListFormatted);

    }


    public void append(T dataForNode) {
        if (this.size() == 0) {
            return;
        }
        Node<T> nodeToAppend = new Node<>(dataForNode, null);
        Node<T> current = this.head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAppend;
    }

    public void prepend(T dataForNode) {
        if (this.linkedListIsEmpty()) {
            return;
        }
        Node<T> nodeToPrepend = new Node<>(dataForNode, this.head);
        nodeToPrepend.next = this.head;
        this.head = nodeToPrepend;
    }  
    
    public Node<T> get(int index) {
        Node<T> current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
        
    }

    public void insertAfter(T nodeData, Node<T> insertAfter) {
        Node<T> newNode = new Node<>(nodeData, insertAfter.next);
        insertAfter.next = newNode;
    }

    public void delete(Node<T> nodeToDelete) {
        if (nodeToDelete == this.head) {
            this.head = this.head.next;
            return;
        }
        Node<T> previous = this.head;
        Node<T> current = this.head.next;

        while (current != nodeToDelete) {
            current = current.next;
            previous = previous.next;
        }
        previous.next = current.next;
    }

    public void delete(int index) {
        if (index == 0) {
            this.head = this.head.next;
            return;
        }
        int currentIndex = 1;
        Node<T> previous = this.head;
        Node<T> current = previous.next;

        while (currentIndex != index) {
            current = current.next;
            previous = previous.next;
            currentIndex++;
        }
        previous.next = current.next;
    }

   
    public void swap(Node<T> firstNode, Node<T> secondNode) {

        Node<T> previous1 = null;
        Node<T> current1 = this.head;

        while (current1 != firstNode) {
            previous1 = current1;
            current1 = current1.next;
        }
        Node<T> previous2 = null;
        Node<T> current2 = this.head;

        while (current2 != secondNode) {
            previous2 = current2;
            current2 = current2.next;
        }

        previous1.next = current2;
        previous2.next = current1;
        Node<T> current1Next = current1.next;
        Node<T> current2Next = current2.next;
        current1.next = current2.next;
        current2Next = current1Next;
    }

    public void reverse() {
        Node<T> previous = null;
        Node<T> current = this.head;

        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    public void removeDuplicates() {
        Node<T> previous = null;
        Node<T> current = this.head;
    
        List<T> uniqueValues = new ArrayList<>();

        while (current.next != null) {
            if (!uniqueValues.contains(current.data)) {
                uniqueValues.add(current.data);
            }
            else {
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public Node<T> nthNodeFromEnd(int n) {
        Node<T> front = this.head;
        Node<T> back = this.head;

        for (int i = 0; i < n; i++) {
            front = front.next;
        }
        while (front != null) {
            front = front.next;
            back = back.next;
        }

        return back;
    }
}
