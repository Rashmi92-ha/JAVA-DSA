package DynamicProgramming;

import java.util.Arrays;

public class Memoization {
    public static long fibonacci(int n) {        // public: what main calls
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return fibonacci(n, memo);               // calls the private helper
    }

    private static long fibonacci(int n, long[] memo) {   // does the real work
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci of " + n + " = " + fibonacci(n));
    }
}
