package com.preps.javaconcepts.collectionsconcepts;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsConcept implements Serializable {


    public static void main(String[] args) {
//        List<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("Hello");
//        stringArrayList.add("there");
//        stringArrayList.add("this");
//        stringArrayList.add("is");
//        stringArrayList.add("list");
//        stringArrayList.add("implementation");
//        stringArrayList.add("from");
//        stringArrayList.add("collections");
//        stringArrayList.add(null);
//        System.out.println(stringArrayList);
//        stringArrayList.add(4, "Added to index 4"); // Addition to a given index
//        System.out.println(stringArrayList);
//        stringArrayList.add("list");
//        System.out.println(stringArrayList);
//        System.out.println("First occurrence found at: " + stringArrayList.indexOf("list"));
//        System.out.println("Last occurrence found at: " + stringArrayList.lastIndexOf("list"));
//
//        stringArrayList.remove("list"); //This removes the first occurrence of the object passed
//        System.out.println(stringArrayList);
//        stringArrayList.remove(9); //This removes the values based on the index passed
//        System.out.println(stringArrayList);
//        stringArrayList.forEach(String::toUpperCase);
//        System.out.println(stringArrayList.get(5)); // Get object at given index
//        System.out.println(stringArrayList.contains("there")); // Returns boolean value whether the element is present
//        System.out.println("All UPPER: " + stringArrayList);
//        List<String> stringLinkedList = new LinkedList<>(); //This implementation does not provide the methods of the Deque as the reference is of List
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.addFirst("First"); // This method is from the deque class
////        linkedList.addLast("Last"); // This method is from the deque class
//        linkedList.add("Second");
//        linkedList.add("Third");
//        linkedList.add("Fourth");
//        linkedList.add("Fifth");
//        linkedList.addFirst("Added-to-first-position");
//        linkedList.addLast("Added-to-last-position");
//
//        System.out.println(linkedList);
//
//        Set<Integer> setA = new HashSet<>();
//        Set<Integer> setB = new HashSet<>();
//        Set<String> setC = new HashSet<>();
//        setA.addAll(Arrays.asList(new Integer[]{1, 2, 3, 5, 4, 6}));
//        setB.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
//
////      Finding Union on the sets
//        Set<Integer> union = new HashSet<>(setA);
//        union.addAll(setB);
//        System.out.println("\n\nUnion of Set A and Set B: " + union);
//
////      Finding Intersection on the sets
//        Set<Integer> intersection = new HashSet<>(setA);
//        intersection.retainAll(setB);
//        System.out.println("Intersection of Set A and Set B:" + intersection);
//
//        Set<Integer> inte = new TreeSet<>();
//        TreeSet<Integer> inte2 = new TreeSet<>();
//
//        List<Integer> in = new CopyOnWriteArrayList<>();
//
//        List<String> li = new ArrayList<>(setC);
//
//        Map<Integer, String> tree = new TreeMap<>();
//
//        System.out.println("\n\n\nTreemap here");
//        tree.put(12, "Rajat");
//        tree.put(10, "Anushri");
//
//        System.out.println(tree);
//        for (Map.Entry<Integer, String> en : tree.entrySet()) {
//            System.out.println(en.getKey() + " " + en.getValue());
//        }

        Collections cs;
        Collection c;
        List<String> ls = Collections.synchronizedList(new ArrayList<>());
        ls.add("S1");
        ls.add("S2");
        ls.add("S3");
        ls.add(0, "S0");
        System.out.println(ls);
        ls.set(3, "S_last");
        System.out.println(ls);

        Deque<String> dq;

        Map<Integer, String> mp = new HashMap<>();

        // Random object to generate random values
        Random random = new Random();

        // Possible random strings to use as values
        String[] possibleValues = {
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Indian Fig", "Jackfruit",
                "Kiwi", "Lemon", "Mango", "Nectarine", "Orange",
                "Papaya", "Quince", "Raspberry", "Strawberry", "Tangerine"
        };

        // Add 15 random entries to the map
//        System.out.println("Adding 15 random entries to the map:\n");

        for (int i = 0; i < 15; i++) {
            // Generate random key (between 1 and 100)
            int randomKey = random.nextInt(100) + 1;

            // Generate random string from the possibleValues array
            String randomValue = possibleValues[random.nextInt(possibleValues.length)];

            // Put the entry in the map
            mp.put(randomKey, randomValue);

//            System.out.println("Added: " + randomKey + " -> " + randomValue);
        }

        // Print the final map
//        System.out.println("\n=== Final Map Contents ===");
//        System.out.println("Size of map: " + mp.size() + " entries\n");

        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        LinkedList<?> lst;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(13);
        pq.add(3);
        pq.add(8);
        pq.add(6);
        pq.add(2);

        System.out.println("Priority queue: " + pq);

        ArrayDeque<?>adq;

        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
        chm.put(12, null);
        System.out.println(chm);
    }
}
