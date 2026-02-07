package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        LinkedList<String> linkedListStr = new LinkedList<>();
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        LinkedList<Integer> llist = new LinkedList<>();

        linkedListInt.append(1);
        linkedListInt.append(5);
        linkedListInt.append(6);
        linkedListInt.append(8);

        llist.append(2);
        llist.append(3);
        llist.append(4);
        llist.append(7);

       System.out.println(linkedListInt.merge_sorted(llist.head));




    }
}
