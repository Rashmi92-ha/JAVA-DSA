package DynamicProgramming;

import java.util.Arrays;

public class Mincostclimbingstairsmemoization {

    // cost[i] is the price of standing on step i; after paying you may climb 1 or 2 steps.
    // You may start at step 0 or step 1, and the top is one position past the last step.
    public static int minCostClimbingStairs(int[] cost) {
        if (cost == null) {
            throw new IllegalArgumentException("cost array is null");
        }
        for (int c : cost) {
            if (c < 0) {
                // -1 is used as the "not computed" marker, so costs must not be negative
                throw new IllegalArgumentException("costs must be non-negative");
            }
        }
        int n = cost.length;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return minCost(n, cost, memo);
    }

    // Minimum cost to reach position i (position n is the top)
    private static int minCost(int i, int[] cost, int[] memo) {
        if (i <= 1) return 0;                 // you can start on step 0 or 1 for free
        if (memo[i] != -1) return memo[i];

        int fromOneBelow = minCost(i - 1, cost, memo) + cost[i - 1];
        int fromTwoBelow = minCost(i - 2, cost, memo) + cost[i - 2];

        memo[i] = Math.min(fromOneBelow, fromTwoBelow);
        return memo[i];
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println("Cost " + Arrays.toString(cost1) + " -> " + minCostClimbingStairs(cost1));
        System.out.println("Cost " + Arrays.toString(cost2) + " -> " + minCostClimbingStairs(cost2));
    }
}