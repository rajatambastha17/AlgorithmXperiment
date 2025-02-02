package com.preps.javaconcepts.finalkeywordconcepts;

public class FinalConcepts {

    public static void main(String[] args) {
        SpeedLimit finalSpeedLimit = new SpeedLimit(34);
        int limit = finalSpeedLimit.getLimit();
        finalSpeedLimit.print();
        System.out.println(" " + limit);
    }
}

// A final class can't be extended
final class SpeedLimit {

    private final int limit;

    private static final int random;

    static {
        random = 90;
    }

    private int age;
    private int roll;

    public SpeedLimit(int limit) {
        this.limit = limit;
    }

    public SpeedLimit(int limit, int age, int roll) {
        this.limit = limit;
        this.age = age;
        this.roll = roll;
    }

    public SpeedLimit(int roll, int limit) {
        this.limit = limit;
        this.roll = roll;
    }


    public void print() {
        System.out.print("Print");
    }

    public int getLimit() {
        return limit;
    }
}