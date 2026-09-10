package com.preps.datastructures.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DequeUsingMap<T> {

    private Map<Integer, T> dequeMap = new HashMap<>();
    private int head = 0;
    private int tail = -1;

    public static void main(String[] args) {
        DequeUsingMap<Integer> deque = new DequeUsingMap<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Choose from the options below: ");
        boolean flag = true;
        while (flag) {
            System.out.println("For adding to front     -->  Press 1");
            System.out.println("For adding to Rear      -->  Press 2 ");
            System.out.println("For deleting from front -->  Press 3");
            System.out.println("For deleting from Rear  -->  Press 4");
            System.out.println("For printing the deque  -->  Press 5");
            System.out.println("To quit the program     -->  Press 6");
            System.out.println();
            int input = s.nextInt();
            int data;
            switch (input) {
                case 1:
                    System.out.println("Enter the value to insert: ");
                    data = s.nextInt();
                    deque.addFront(data);
                    break;
                case 2:
                    System.out.println("Enter the value to insert: ");
                    data = s.nextInt();
                    deque.addRear(data);
                    break;
                case 3:
                    Integer valueDeletedFromFront = deque.deleteFromHead();
                    System.out.println("Deleted value: " + valueDeletedFromFront);
                    break;
                case 4:
                    Integer valueDeletedFromTail = deque.deleteFromTail();
                    System.out.println("Deleted value: " + valueDeletedFromTail);
                    break;
                case 5:
                    deque.printDeque();
                    break;
                case 6:
                    System.out.println("Thanks for using the program.");
                    flag = false;
                    break;
                default:
                    System.out.println("Not a valid input!");
            }
        }
    }

    public void addFront(T value) {
        head--;
        dequeMap.put(head, value);
    }

    public void addRear(T value) {
        tail++;
        dequeMap.put(tail, value);
    }

    public T deleteFromHead() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Deque!");
        }
        T value = dequeMap.get(head);
        dequeMap.remove(head);
        head++;
        return value;
    }

    public T deleteFromTail() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        T val = dequeMap.get(tail);
        dequeMap.remove(tail);
        tail--;
        return val;
    }

    public boolean isEmpty() {
        return head > tail;
    }

    public void printDeque() {
        for (int i = head; i <= tail; i++) {
            System.out.print(dequeMap.get(i) + " ");
        }
        System.out.println();
    }
}
