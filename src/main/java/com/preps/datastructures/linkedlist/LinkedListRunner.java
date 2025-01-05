package com.preps.datastructures.linkedlist;

import com.preps.datastructures.linkedlist.implementation.LinkedListImplementation;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation();
        linkedList.insertAtLast(9);
        linkedList.insertAtLast(7);
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(12);
        linkedList.insertAtBeginning(18);
        linkedList.insertAtBeginning(25);
        linkedList.insertAtLast(13);
        linkedList.insertAtLast(22);
        linkedList.insertAtLast(23);
        linkedList.insertAtLast(34);
        System.out.println("Linked List:");
        linkedList.traverse();
        boolean doesKeyExist = linkedList.search(56);
        System.out.println("Does 56 exist in the list?\n" + doesKeyExist);
        linkedList.deleteKeyByValue(22);
        linkedList.traverse();
    }
}
