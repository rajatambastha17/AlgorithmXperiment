package com.preps.questions;

public class Calendar {

    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] CUMULATIVE_DAYS;

    static {
        CUMULATIVE_DAYS = new int[12];
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += DAYS_IN_MONTHS[i];
            CUMULATIVE_DAYS[i] = sum;
        }
    }

    public static int daysSinceBeginningOfYear(int month, int dayOfMonth) { // 3, 12
        // implement solution

        if (month > 12 || month <= 0) {
            System.out.print("Months should not be less than 0 or exceed 12!");
            return 0;
        }

        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days = days + DAYS_IN_MONTHS[i];
        }
        days = days + dayOfMonth;
        return days;
    }

    public static int daysSinceBeginningOfYearOptimised(int month, int dayOfMonth) {
        if (month == 1) { // January has no previous month.
            return dayOfMonth;
        }
        return CUMULATIVE_DAYS[month - 2] + dayOfMonth;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int days1 = daysSinceBeginningOfYear(5, 18);
        long end = System.currentTimeMillis();
        System.out.println("Time to run taken by non optimised: " + (end - start));
        System.out.println(days1);

        start = System.currentTimeMillis();
        int days = daysSinceBeginningOfYearOptimised(5, 18);
        end = System.currentTimeMillis();
        System.out.println("Time to run taken by optimised: " + (end - start));
        System.out.println(days);
    }
}