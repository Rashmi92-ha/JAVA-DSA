package DynamicProgramming;

import java.util.Arrays;

public class KnapsackTabulation {
    // 0/1 Knapsack: each item can be taken at most once.
    // Returns the maximum total value whose total weight does not exceed capacity.
    // Bottom-up DP: dp[i][w] = best value using only the first i items with capacity w
    public static long maxValue(int[] weights, int[] values, int capacity) {
        validate(weights, values, capacity);
        int n = weights.length;
        long[][] dp = new long[n + 1][capacity + 1]; // row 0 stays 0: no items, no value
        for (int i = 1; i <= n; i++) {
            int weight = weights[i - 1]; // item i is stored at index i - 1
            int value = values[i - 1];
            for (int w = 0; w <= capacity; w++) {
                long skip = dp[i - 1][w]; // leave item i out
                if (weight > w) {
                    dp[i][w] = skip;  // item i does not fit
                } else {
                    long take = dp[i - 1][w - weight] + value; // put item i in
                    dp[i][w] = Math.max(skip, take);
                }
            }
        }
        return dp[n][capacity];
    }

    private static void validate(int[] weights, int[] values, int capacity) {
        if (weights == null || values == null) {
            throw new IllegalArgumentException("Weight and Values should not be null");
        }
        if (weights.length != values.length) {
            throw new IllegalArgumentException("Weight and values should have same length");
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity must be non negative");
        }
        for (int weight : weights) {
            if (weight <=    0) {
                throw new IllegalArgumentException("Weight must be non-negative");
            }
        }
    }

    public static void main(String[] args) {
        int[] weights1 = {1, 3, 4, 5};
        int[] values1 = {1, 4, 5, 7};
        int[] weights2 = {10, 20, 30};
        int[] values2 = {60, 100, 120};

        System.out.println("weights " + Arrays.toString(weights1) + ", values " + Arrays.toString(values1)
                + ", capacity 7 -> " + maxValue(weights1, values1, 7));
        System.out.println("weights " + Arrays.toString(weights2) + ", values " + Arrays.toString(values2)
                + ", capacity 50 -> " + maxValue(weights2, values2, 50));
        System.out.println("capacity 0 -> " + maxValue(weights1, values1, 0));
    }
}
