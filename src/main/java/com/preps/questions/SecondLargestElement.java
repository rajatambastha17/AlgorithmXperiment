package com.preps.questions;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {56, 7, 67, 34, 98, 87, 2, 1, 35, 0};
        secondLargestElementFromArray(arr);
        secondSmallestElementFromArray(arr);
    }

    public static void secondLargestElementFromArray(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        System.out.println("Second Largest element is: " + secondLargest);
    }

    public static void secondSmallestElementFromArray(int[] arr) {
        int smallest = arr[0];
        int secondsmallest = arr[0];

        for (int j : arr) {
            if (j < smallest) {
                secondsmallest = smallest;
                smallest = j;
            } else if (j > smallest && j < secondsmallest) {
                secondsmallest = j;
            }
        }
        System.out.println("Second Smallest element is: " + secondsmallest);
    }
}
