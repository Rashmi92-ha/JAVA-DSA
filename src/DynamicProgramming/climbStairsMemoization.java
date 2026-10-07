package DynamicProgramming;

import java.util.Arrays;

public class climbStairsMemoization {
    public static long climStairs(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n > 91) {
            throw new IllegalArgumentException("n too large for long");
        }
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return climbStairsMemo(n, memo);
    }

    private static long climbStairsMemo(int n, long[] memo) {
        if (n <= 1) return 1;
        if (memo[n] != -1) return memo[n];
        memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Climb Strais: " + n + " = " + climStairs(n));
    }
}
