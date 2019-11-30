package main.gigacode2019;

import java.util.Scanner;

public class F_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] rc = new int[2][n];
        for (int i = 0; i < n; i++) {
            rc[0][i] = sc.nextInt();
            rc[1][i] = sc.nextInt();
        }

        // 制約1
        if (h == 1 && w == 1) {
            if (n == 1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            System.exit(0);
        }

        // 制約2
        int ans = solve(h, w, n, rc);
        System.out.println(ans);
    }

    static int solve(int h, int w, int n, int[][] rc) {
        int[] block = new int[w + 1];
        int ans = 0;

        if (h == 1) {
            // ランレングス圧縮したいので障害物を埋める。
            for (int i : rc[1]) {
                block[i] = 1;
            }

            // 圧縮
            int before = 0;
            for (int i = 0; i < block.length; i++) {
                if (block[i] == 1 && before == 0) {
                    if (i == w) {
                        break;
                    }
                    ans++;
                    before = 1;
                }
                if (block[i] == 0 && before == 1) {
                    before = 0;
                }
            }

            if (n == w) {
                // 全部埋まってる場合
                ans = 0;
            } else if (n == 0) {

                // 全部埋まってない場合
                ans = 1;
            } else if (ans == 0 && n != w) {
                // 終端のみ値がある
                ans++;
            }
        }
        return ans;
    }
}
