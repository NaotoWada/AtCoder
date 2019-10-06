package main.bignner.contest133;

import java.util.Scanner;

public class B_GoodDistance2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                double dist = 0;
                for (int k = 0; k < d; k++) {
                    dist += calc(x[j][k], x[i][k]);
                }

                // 整数？
                if (Math.sqrt(dist) % 1 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static double calc(int i, int j) {
        // System.out.printf(" (%s, %s)\n", i, j);
        return Math.pow(Math.abs(i - j), 2);
    }
}
