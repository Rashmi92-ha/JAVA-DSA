package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeTabulation {
    public static int minCoins(int[] coins, int amount) {
        validate(coins, amount);
        int unreachable = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, unreachable);
        dp[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a) {
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1);
                }
            }
        }
        return dp[amount] == unreachable ? -1 : dp[amount];
    }

    private static void validate(int[] coins, int amount) {
        if (coins == null) {
            throw new IllegalArgumentException("coins array is null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative");
        }
        for (int coin : coins) {
            if (coin <= 0) {
                throw new IllegalArgumentException("Coins must be positive");
            }
        }
    }
    public static void main(String[] args){
        int[] coins1 = {1, 2, 5};
        int[] coins2 = {2};
        int[] coins3 = {1, 3, 4};

        System.out.println("coins " + Arrays.toString(coins1) + ", amount 11 -> " + minCoins(coins1, 11));
        System.out.println("coins " + Arrays.toString(coins2) + ", amount 3 -> " + minCoins(coins2, 3));
        System.out.println("coins " + Arrays.toString(coins3) + ", amount 6 -> " + minCoins(coins3, 6));
        System.out.println("coins " + Arrays.toString(coins1) + ", amount 0 -> " + minCoins(coins1, 0));
    }
}
