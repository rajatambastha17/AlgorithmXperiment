package com.preps.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        String input = "[{(){{({})}()}}]}";
        boolean out = checkValidParanthesis(input);
        System.out.println(out);
    }

    public static boolean checkValidParanthesis(String input) {

        if (input.isBlank()) {
            return true;
        }
        if (input.charAt(0) == ')' || input.charAt(0) == '}' || input.charAt(0) == ']') {
            return false;
        }

        Stack<Character> pStack = new Stack<>();
        Map<Character, Character> pMap = new HashMap<>();
        pMap.put(')', '(');
        pMap.put('}', '{');
        pMap.put(']', '[');
        for (Character c : input.toCharArray()) {
            if (pMap.containsValue(c)) {
                pStack.push(c);
            } else if (pMap.containsKey(c)) {
                if (pStack.isEmpty() || pStack.pop() != pMap.get(c)) {
                    return false;
                }
            }
        }
        return pStack.isEmpty();
    }
}
