package com.java.leetcodeproblems.leetcodeproblemstester;

import com.java.leetcodeproblems.mergetwosortedlinkedlists.MergeTwoSortedLinkedLists;
import com.datastructures.linkedlist.singly.*;

public class MergeTwoSortedLinkedListsTest {
    public static void main(String[] args) {
        MergeTwoSortedLinkedLists tester = new MergeTwoSortedLinkedLists();
        Node<Integer> head1 = new Node<>(1, null);
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>(head1);
        Node<Integer> head2 = new Node<>(1, null);
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>(head2);
        
        SinglyLinkedList<Integer> resultList = tester.solution(null, null);
    }
}
