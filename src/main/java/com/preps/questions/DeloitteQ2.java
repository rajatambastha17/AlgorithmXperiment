package com.preps.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeloitteQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<String> passwords = new ArrayList<>();
        int len = str.length();
        boolean[] used = new boolean[len];

        generatePasswords(str.toCharArray(), used, 0, new StringBuilder(), passwords);

        Collections.sort(passwords);

        for (int i = 0; i < passwords.size(); i++) {
            System.out.print(passwords.get(i));
            if (i < passwords.size() - 1) System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }

    static void generatePasswords(char[] str, boolean[] used, int pos,
                                  StringBuilder current, ArrayList<String> passwords) {
        if (pos == str.length) {
            if (!current.isEmpty() && Character.isDigit(current.charAt(0))) {
                passwords.add(current.toString());
            }
            return;
        }

        for (int i = 0; i < str.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(str[i]);
                generatePasswords(str, used, pos + 1, current, passwords);
                current.setLength(current.length() - 1);
                used[i] = false;
            }
        }
    }
}