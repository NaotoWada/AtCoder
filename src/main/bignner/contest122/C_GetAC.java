package main.bignner.contest122;

import java.util.Scanner;

public class C_GetAC {
    public static void main(String[] args) {
        // シミュレーション
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
        for (int i = 0; i < q; i++) {
            int start = lr[i][0];
            int end = lr[i][1];
            String tmp = s.substring(start - 1, end);

            System.out.println(count(tmp));
        }
    }

    private static int count(String tmp) {
        String replace = tmp.replace("AC", "#");
        return tmp.length() - replace.length();
    }
}
