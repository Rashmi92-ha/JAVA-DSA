package DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbingStairsTabulation {
    public static int MinCostClimbingStairs(int[] cost) {
        // cost[i] is the price of standing on step i; after paying you may climb 1 or 2 steps.
        // You may start at step 0 or step 1, and the top is one position past the last step.
        // Bottom-up DP: dp[i] = minimum cost to land on step i (including paying cost[i]).
        int n = validate(cost);
        if (n <= 0) {
            return 0; // start on step 1 (or there are no steps): already at the top
        }
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        // The top is reached from the last step or the one before it
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static int minCostClimbingStairsOptimized(int[] cost) {
        int n = validate(cost);
        if (n <= 1) {
            return 0;
        }
        int prev2 = cost[0];
        int prev1 = cost[1];
        for (int i = 2; i < n; i++) {
            int current = Math.min(prev1, prev2) + cost[i];
            prev2 = prev1;
            prev1 = current;
        }
        return Math.min(prev1, prev2);
    }

    private static int validate(int[] cost) {
        if (cost == null) {
            throw new IllegalArgumentException("Cost Array is null");
        }
        for (int c : cost) {
            if (c < 0) {
                throw new IllegalArgumentException("Cost must be non negative");
            }
        }
        return cost.length;
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println("Cost " + Arrays.toString(cost1) + " -> " + MinCostClimbingStairs(cost1));
        System.out.println("Cost " + Arrays.toString(cost2) + " -> " + MinCostClimbingStairs(cost2));
        System.out.println("O(1) space: " + minCostClimbingStairsOptimized(cost1)
                + " and " + minCostClimbingStairsOptimized(cost2));
    }
}
