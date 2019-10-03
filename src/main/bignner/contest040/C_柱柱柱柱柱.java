package main.bignner.contest040;

import java.util.Scanner;

public class C_柱柱柱柱柱 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        dp[1] = Math.abs(a[0] - a[1]);
        for (int i = 2; i < n; i++) {
            int c1 = dp[i - 1] + Math.abs(a[i - 1] - a[i]);
            int c2 = dp[i - 2] + Math.abs(a[i - 2] - a[i]);

            dp[i] = Math.min(c1, c2);
        }

        System.out.println(dp[n - 1]);
    }
}
