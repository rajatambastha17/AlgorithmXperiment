package com.preps.questions;

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
    }
}
