package com.preps.sandbox;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        String email = "rajat@gmail.com";
        String changed = appendSuffix(email, LocalDateTime.now());
        System.out.println(changed);
    }

    public static String appendSuffix(String originalEmail, LocalDateTime date) {
        StringBuilder sb = new StringBuilder();
        String uid = "hdghhj2346234hui";
        int atIndex = originalEmail.indexOf('@');
        String prefix = originalEmail.substring(0, atIndex);
        String domain = originalEmail.substring(atIndex);
        sb.append(prefix).append("+arc_").append(uid).append(domain);
        return sb.toString();
    }
}
