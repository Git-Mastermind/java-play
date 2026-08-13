package com.datastructures.stack;

public class DetermineBracketBalanceTester {
    public static void main(String[] args) {
        DetermineBracketBalance tester = new DetermineBracketBalance();
        String brackets = "({[]})";
        boolean isBracketsBalance = tester.determineBracketBalance(brackets);
        System.out.print(isBracketsBalance);
    }
}
