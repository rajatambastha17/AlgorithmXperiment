package com.preps.datastructures.stack;

public class Stack {
    private int[] stackArray;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        }
        stackArray[++top] = element;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
        }
        return stackArray[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
