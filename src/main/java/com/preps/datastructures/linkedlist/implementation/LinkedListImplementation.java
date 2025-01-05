package com.preps.datastructures.linkedlist.implementation;

public class LinkedListImplementation {

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public boolean search(int key) {
        Node current = head;
        if (current.data == key) {
            return true;
        }
        while (current.next != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteKeyByValue(int key) {
        if (head == null) {
            System.out.println("List is empty!");
        }
        if (head.data == key) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value not found in the list!");
        }
        current.next = current.next.next;
    }
}
