package com.preps.javaconcepts.collectionsconcepts;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsConcept {


    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("there");
        stringArrayList.add("this");
        stringArrayList.add("is");
        stringArrayList.add("list");
        stringArrayList.add("implementation");
        stringArrayList.add("from");
        stringArrayList.add("collections");
        stringArrayList.add(null);
        System.out.println(stringArrayList);
        stringArrayList.add(4, "Added to index 4"); // Addition to a given index
        System.out.println(stringArrayList);
        stringArrayList.add("list");
        System.out.println(stringArrayList);
        System.out.println("First occurrence found at: " + stringArrayList.indexOf("list"));
        System.out.println("Last occurrence found at: " + stringArrayList.lastIndexOf("list"));

        stringArrayList.remove("list"); //This removes the first occurrence of the object passed
        System.out.println(stringArrayList);
        stringArrayList.remove(9); //This removes the values based on the index passed
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.get(5)); // Get object at given index
        System.out.println(stringArrayList.contains("there")); // Returns boolean value whether the element is present

        List<String> stringLinkedList = new LinkedList<>(); //This implementation does not provide the methods of the Deque as the reference is of List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First"); // This method is from the deque class
//        linkedList.addLast("Last"); // This method is from the deque class
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");
        linkedList.add("Fifth");
        linkedList.addFirst("Added-to-first-position");
        linkedList.addLast("Added-to-last-position");

        System.out.println(linkedList);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        setA.addAll(Arrays.asList(new Integer[]{1, 2, 3, 5, 4, 6}));
        setB.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

//      Finding Union on the sets
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("\n\nUnion of Set A and Set B: " + union);

//      Finding Intersection on the sets
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of Set A and Set B:" + intersection);

        Set<Integer> inte = new TreeSet<>();
        TreeSet<Integer> inte2 = new TreeSet<>();

        List<Integer> in = new CopyOnWriteArrayList<>();

    }
}
