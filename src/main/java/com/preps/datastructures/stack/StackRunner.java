package com.preps.datastructures.stack;

public class StackRunner {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        System.out.println("Stack Empty: " + stack.isEmpty());
        stack.push(10);
        stack.push(12);
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
