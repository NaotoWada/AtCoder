package main.dp.matome;

import java.util.Scanner;

public class B_Frog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] h = new int[N];
        int[] dp = new int[N];
        int MAX_H = 10001;
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
            dp[i] = MAX_H;
        }

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);
        for (int i = 1; i < N; i++) {
            int min1 = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
            for (int k = i; k < K && i - k > 0; k++) {
                int min2 = dp[i - k] + Math.abs(h[i - k] - h[i]);
                dp[i] = Math.min(min1, min2);
            }
        }

        System.out.println(dp[N - 1]);
    }
}

