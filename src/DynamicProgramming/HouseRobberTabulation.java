package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberTabulation {
    // Maximum money you can rob without robbing two adjacent houses.
    // Bottom-up DP: dp[i] = best total using only houses 0..i,
    public static long rob(int[] nums) {
        validate(nums);

        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        long[] dp = new long[n];
        dp[0] = nums[0]; // only one house to consider
        dp[1] = Math.max(nums[0], nums[1]); // the richer of the first two houses

        for (int i = 2; i < n; i++) {
            long skip = dp[i - 1];
            long take = dp[i - 2] + nums[i];
            dp[i] = Math.max(skip, take);
        }
        return dp[n - 1];
    }

    private static void validate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("nums array is null");
        }
        for (int money : nums) {
            if (money < 0) {
                // the base case dp[0] = nums[0] forces robbing the first house,
                // which is only correct when every amount is non-negative,
                throw new IllegalArgumentException("house values must be non-negative");
            }
        }
    }

    public static void main(String[] args){
        int[] houses1 = {1, 2, 3, 1};
        int[] houses2 = {2, 7, 9, 3, 1};
        int[] houses3 = {2, 1, 1, 2};


        System.out.println("Houses " + Arrays.toString(houses1) + " -> " + rob(houses1));
        System.out.println("Houses " + Arrays.toString(houses2) + " -> " + rob(houses2));
        System.out.println("Houses " + Arrays.toString(houses3) + " -> " + rob(houses3));
    }
}
