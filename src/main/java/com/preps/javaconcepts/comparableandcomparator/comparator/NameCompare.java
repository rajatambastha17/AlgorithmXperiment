package com.preps.javaconcepts.comparableandcomparator.comparator;

import java.util.Comparator;

class NameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {

        // Sort by name in alphabetical order
        return m1.getN().compareTo(m2.getN());
    }
}
