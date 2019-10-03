package main.dp.matome;

import java.util.Scanner;

public class B_Frog2_other2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i >= j) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(input[i] - input[i - j]));
                }
            }
        }

        System.out.println(dp[n - 1]);
    }
}
