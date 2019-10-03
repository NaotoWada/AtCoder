package main.bignner.contest006;

import java.util.Scanner;

public class C_スフィンクスのなぞなぞ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        String ans = solve(N, M);

        System.out.println(ans);
    }

    private static String solve(int N, int M) {
        String ans = "-1 -1 -1";
        for (int i = 0; i < N; i++) { // 2本
            for (int j = 0; j < N; j++) { // 3本
                // 人数計算
                int k = (N - i - j);
                if (k < 0) {
                    break;
                }
                if (M - (i * 2 + j * 3 + k * 4) == 0) {
                    return i + " " + j + " " + k;
                }
            }
        }
        return ans;
    }
}
