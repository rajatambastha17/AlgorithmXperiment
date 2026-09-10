package com.preps.questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class jp1 {
    public static void main(String[] args) {
        List<String> in = new ArrayList<>();
        in.add("item2");
        in.add("item1");
        in.add("item3");
        in.add("item3");
        in.add("item4");
        in.add("item4");
        in.add("item2");
        in.add("item4");
        in.add("item2");
        in.add("item2");
        System.out.println("\n\n\nFinal--> " + getItem(in, 3));
    }

    public static List<String> getItem(List<String> requests, int K) {
        Set<String> itemSet = new LinkedHashSet<>();
        System.out.print(requests + " " + K+"\n");
        System.out.println();
        for (int i = requests.size() - 1; i >= 0; i--) {
            if (itemSet.size() < K) {
                System.out.print(requests.get(i)+" ");
                itemSet.add(requests.get(i));
            }
        }
        return new ArrayList<>(itemSet);
    }
}
