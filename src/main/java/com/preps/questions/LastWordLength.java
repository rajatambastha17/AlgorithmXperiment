package com.preps.questions;

public class LastWordLength {
    public static void main(String[] args) {

        String s = "My    name is  Anthony   ";
        s.trim();
        String[] str= s.split(" ");
        System.out.println(str[str.length-1].length());
        String hay = "Timtoobuk";
        String nee = "bukr";

        System.out.println(hay.indexOf(nee));
    }
}
