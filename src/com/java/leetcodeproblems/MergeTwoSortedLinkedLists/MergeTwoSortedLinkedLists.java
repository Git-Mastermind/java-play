package com.java.leetcodeproblems.mergetwosortedlinkedlists;

import com.datastructures.linkedlist.singly.*;

public class MergeTwoSortedLinkedLists {
    public SinglyLinkedList<Integer> solution(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2) {
        Node<Integer> pointer1 = list1.head();
        Node<Integer> pointer2 = list2.head();
        SinglyLinkedList<Integer> endingLinkedList = new SinglyLinkedList<>(null);
        while (pointer1 != null && pointer2 != null) {
            if (pointer1.data < pointer2.data) {
                endingLinkedList.append(pointer1.data);
                pointer1 = pointer1.next;
            }
            else if (pointer2.data > pointer1.data) {
                endingLinkedList.append(pointer2.data);
                pointer2 = pointer2.next;
            }
            else if (pointer1 == pointer2) {
                endingLinkedList.append(pointer1.data);
                endingLinkedList.append(pointer2.data);
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
        }
        return endingLinkedList;
    }
}
