package com.preps.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeriesWithoutLoop {

    //    int a = 0;
    public static void series(int input, int range) {
        if (input <= range) {
            System.out.print(input + " ");
            input++;
            series(input, range);
        }
    }

    public static void main(String[] args) {
        int input = 3;
        int range = 20;
        series(input, range);
        List<String> list = new ArrayList<>();
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
    }
}
