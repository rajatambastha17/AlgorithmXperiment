package com.preps.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {3, 5, 7, 9, 12, 14, 18, 21, 23, 27, 29, 31, 34, 36, 38, 41, 43, 46, 49, 52, 54, 56, 59, 61, 63, 66, 68, 71, 73, 75, 78, 80, 82, 85, 87, 90, 92, 94, 97, 99, 101, 103, 105, 108, 110, 112, 114, 117, 119, 122, 124, 126, 129, 131, 134, 136, 138, 141, 143, 146, 148, 150, 153, 155, 157, 159, 162, 164, 167, 169, 172, 174, 176, 179, 181, 183, 186, 188, 191, 193, 196, 198, 201, 203, 206, 208, 211, 213, 216, 218, 221, 223, 226, 228, 231, 233, 236, 238, 241, 243, 246, 248, 251, 253, 256, 258, 261, 263, 266, 268, 271, 273, 276, 278, 281, 283, 286, 288, 291, 293, 296, 298, 301, 303, 306, 308, 311, 313, 316, 318, 321, 323, 326, 328, 331, 333, 336, 338, 341, 343, 346, 348, 351, 353, 356, 358, 361, 363, 366, 368, 371, 373, 376, 378, 381, 383, 386, 388, 391, 393, 396, 398, 401, 403, 406, 408, 411, 413, 416, 418, 421, 423, 426, 428, 431, 433, 436, 438, 441, 443, 446, 448, 451, 453, 456, 458, 461, 463, 466, 468, 471, 473, 476, 478, 481, 483};
        String result = binarySearch(input, 481);
        System.out.println(result);
    }

    public static String binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;
        int cuurentMiddleElement = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] == target) {
                cuurentMiddleElement = array[mid];
                return target + " found at index: " + mid;
            } else if (target < array[mid]) {
                cuurentMiddleElement = array[mid];
                high = mid - 1;
            } else {
                cuurentMiddleElement = array[mid];
                low = mid + 1;
            }
        }
        return "Element not found in the array!";
    }
}