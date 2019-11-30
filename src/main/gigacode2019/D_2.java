package main.gigacode2019;

import java.util.Scanner;

public class D_2 {

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
        Amount[][] dp = new Amount[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                // 参照更新していく
                Amount am = new Amount();
                dp[i][j] = am;

                for (int ii = i; ii < h; ii++) {
                    for (int jj = j; jj < w; jj++) {
                        if (v < (dp[i][j].calc(k) + hw[ii][jj] + k)) {
                            break;
                        }

                        // 価格と選んだ個数を更新していく
                        am.add(hw[ii][jj]);
                    }
                }

            }
        }
        int max = -1;
        for (Amount[] amounts : dp) {
            for (Amount am : amounts) {
                max = Math.max(am.area_point, max);
            }
        }
        System.out.println(max);
    }

    private static void echo(Amount[][] dp) {
        for (Amount[] amounts : dp) {
            for (Amount amounts2 : amounts) {
                System.out.printf("%s ", amounts2.area_point);
            }
            System.out.println();
        }
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
