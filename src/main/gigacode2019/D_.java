package main.gigacode2019;

import java.util.Scanner;

public class D_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        long v = sc.nextLong();

        int[][] hw = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                hw[i][j] = sc.nextInt();
            }
        }

        // とりあえず線形の場合を倒す
        Amount[] dp = new Amount[w];
        for (int i = 0; i < w; i++) {

            // 参照更新していく
            Amount am = new Amount();
            dp[i] = am;
            for (int j = i; j < w; j++) {
                if (v < dp[i].calc(k) + hw[0][j] + k) {
                    break;
                }

                // 価格と選んだ個数を更新していく
                am.add(hw[0][j]);
            }
        }

        int max = -1;
        for (Amount amount : dp) {
            max = Math.max(max, amount.area_point);
        }
        System.out.println(max);
    }

    static class Amount {
        int area_point;
        int sum;

        public long calc(int k) {
            return (area_point * k) + sum;
        }

        public void add(int val) {
            sum += val;
            area_point++;
        }

        @Override
        public String toString() {
            return this.area_point + ": " + this.sum;
        }
    }
}
