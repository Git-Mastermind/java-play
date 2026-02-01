package main.implementations;
import java.util.*;
public class TestRunner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        stack.push("Harry Potter");
        stack.push("This should be popped or peeked");
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.search("This should be poppd or peeked"));
        
    }
}
