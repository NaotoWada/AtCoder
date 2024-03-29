package main.bignner.contest122;

import java.util.Scanner;

public class C_GetAC3 {
    public static void main(String[] args) {
        // シミュレーション
        // 累積和の数え上げ
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();

        // query
        int[][] lr = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            lr[i][0] = Integer.parseInt(sc.next());
            lr[i][1] = Integer.parseInt(sc.next());
        }

        solve(N, Q, S, lr);
    }

    static void solve(int n, int q, String s, int[][] lr) {
        int[] t = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int add = s.substring(i, i + 2).equals("AC") ? 1 : 0;
            // 累積和でl-rの区間の出現数をカウントできるようにする
            t[i + 1] = t[i] + add;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int l = lr[i][0];
            int r = lr[i][1];

            sb.append(t[r - 1] - t[l - 1]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
