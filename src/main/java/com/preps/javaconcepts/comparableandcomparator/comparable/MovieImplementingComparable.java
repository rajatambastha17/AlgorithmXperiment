package com.preps.javaconcepts.comparableandcomparator.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MovieImplementingComparable implements Comparable<MovieImplementingComparable> {
    private String n;
    private double r;
    private int y;

    public MovieImplementingComparable(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }

    @Override
    public int compareTo(MovieImplementingComparable m) {
        return this.y - m.y;
    }
}

class Runner {

    public static void main(String[] args) {

        ArrayList<MovieImplementingComparable> l = new ArrayList<>();
        l.add(new MovieImplementingComparable("Star Wars", 8.7, 1977));
        l.add(new MovieImplementingComparable("Empire Strikes Back", 8.8, 1980));
        l.add(new MovieImplementingComparable("Return of the Jedi", 8.4, 1983));

        Collections.sort(l);

        // Display the sorted list of movies
        System.out.println("Movies after sorting by year:");
        for (MovieImplementingComparable m : l) {

            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
