package com.datastructures;


public class TestRunner {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("C");
        linkedList.append("D");
        System.out.println(linkedList.print_list());
        linkedList.delete_node("B");
        System.out.println(linkedList.print_list());

        

    }
}
