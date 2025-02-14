package com.preps.questions;

public class Calendar {
    public static int daysSinceBeginningOfYear(int month, int dayOfMonth) { // 3, 12
        // implement solution

        if (month > 12) {
            System.out.print("Months should not exceed value 12!");
            return 0;
        }
        int[] arr = {31, 28, 31, 30, 31, 30, 31};

        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days = days + arr[i];
        }
        days = days + dayOfMonth;
        return days;
    }

    public static void main(String[] args) {
        int days = daysSinceBeginningOfYear(5, 18);
        System.out.println(days);;
    }
}