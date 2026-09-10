package com.preps.questions;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {100, 98, 97, 95, 93, 90, 88, 85, 83, 82, 80, 78, 76, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 58, 56, 55, 54, 52, 50, 48, 46, 45, 44, 43, 42, 41, 40, 42, 44, 47, 50, 52, 55, 58, 60, 61, 63, 65, 67, 68, 70, 71, 73, 75, 77, 78, 80, 82, 85, 88, 90, 91, 92, 93, 94, 95, 97, 99, 100, 99, 97, 95, 93, 90, 88, 85, 82, 80, 77, 75, 73, 70, 68, 65, 62, 60, 58, 56, 54, 52, 50, 48, 47, 45, 43, 42, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 22, 24, 26, 29, 31, 33, 36, 39, 41, 44, 47, 50, 53, 56, 59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 88, 90, 92, 94, 95, 96, 97, 98, 99, 100, 98, 96, 94, 92, 90, 88, 85, 82, 79, 76, 73, 70, 68, 66, 64, 62, 60, 58, 56, 54, 52, 50, 48, 47, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 28, 26, 24, 22};
        System.out.println(findMaxProfit(prices));
    }

    public static int findMaxProfit(int[] prices) {

        int minPriceSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
            }
            int currentProfit = prices[i] - minPriceSoFar;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
