package com.preps.datastructures.heap;

import java.util.Arrays;

public class MinHeap {

    public static int[] buildMinHeap(int[] array) {
        int[] heap = new int[array.length];
        int size = 0;

        for (int value : array) {
            size = insert(heap, size, value);
        }

        return Arrays.copyOf(heap, size);
    }

    private static int insert(int[] heap, int size, int value) {
        heap[size] = value;
        size++;

        int currentIndex = size - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (heap[currentIndex] < heap[parentIndex]) {
                swap(heap, currentIndex, parentIndex);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }

        return size;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printHeap(int[] heap) {
        System.out.print("Heap array: [");
        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i]);
            if (i < heap.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Test array
        int[] inputArray = {50, 30, 40, 10, 20, 25, 15, 35, 5, 45};

        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("\n--- Building Min Heap ---");

        // Build min heap
        int[] minHeap = buildMinHeap(inputArray);

        // Print results
        printHeap(minHeap);
    }
}
