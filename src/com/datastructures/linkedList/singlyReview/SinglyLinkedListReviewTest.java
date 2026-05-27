package com.datastructures.linkedList.singlyReview;

public class SinglyLinkedListReviewTest {
    public static void main(String[] args) {
        SinglyLinkedListReview<String> linkedList = new SinglyLinkedListReview<>();
        linkedList.append("a");
        linkedList.append("b");
        linkedList.append("c");
        linkedList.append("d");
        linkedList.prepend("e");
        linkedList.printList();
    }
}
