package com.preps.questions;

import java.util.Arrays;
import java.util.Stack;

public class Temperatures {

    public static void main(String[] args) {
        int[] temperature = {73, 74, 75, 71, 69, 72, 76, 73, 80, 98, 75, 77, 66, 68, 67, 65, 64, 76, 89, 76};
        int[] res = dailyTemperatures(temperature);
        Arrays.stream(res).forEach((a) -> System.out.print(a + " "));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return result;
    }
}
