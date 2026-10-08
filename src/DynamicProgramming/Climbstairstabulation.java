package DynamicProgramming;

public class Climbstairstabulation {
    public static long climbStairs(int n){
        validate(n);
        if(n <= 1) return 1;
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static long climbStairsOptimized(int n){
        validate(n);
        if(n <= 1) return 1;
        long prev2 = 1;
        long prev1 = 1;
        for(int i=2; i<=n;i++){
            long current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    private static void validate(int n){
        if(n< 0){
            throw new IllegalArgumentException("n must be non-negative");
        }
        if(n>91){
            throw new IllegalArgumentException("n too large for long");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs (table): " + climbStairs(n));
        System.out.println("Ways to climb " + n + " stairs (O(1) space): " + climbStairsOptimized(n));
    }
}
