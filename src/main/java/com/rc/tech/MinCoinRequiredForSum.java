package com.rc.tech;

import java.util.Arrays;

public class MinCoinRequiredForSum {
    public static void main(String[] args) {
        int[] coins = {1, 3, 6};
        int sum = 10;
        int[] minCoins = getMinCoins(coins, sum);
        System.out.println("Minimum number of coins required: " + minCoins[sum]);
    }

    public static int[] getMinCoins(int[] coins, int sum) {
        int[] minCoins = new int[sum + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    int subResult = minCoins[i - coin];
                    if (subResult != Integer.MAX_VALUE && subResult + 1 < minCoins[i]) {
                        minCoins[i] = subResult + 1;
                    }
                }
            }
        }
        return minCoins;
    }
}