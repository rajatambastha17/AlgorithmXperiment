package com.preps.questions;

public class BinaryConverter {
    public static void main(String[] args) {
        int i = 23;
        System.out.println(i + " in binary is: " + convertToBinary(i));
    }

    public static int convertToBinary(int input) {
        int q = input % 2;
        int r = input / 2;
        StringBuilder sb = new StringBuilder();
        sb.append(r);
        while (q != 1) {
            q = q % 2;
            r = q / 2;
            sb.append(r);
        }
        sb.append(q);
        return Integer.parseInt(sb.reverse().toString());
    }
}
