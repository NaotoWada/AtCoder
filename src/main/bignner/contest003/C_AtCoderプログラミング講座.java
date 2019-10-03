package main.bignner.contest003;

import java.util.Arrays;
import java.util.Scanner;

public class C_AtCoderプログラミング講座 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(R);

        double ans = 0L;

        if (K == 1) {
            // edge case
            ans = R[N - 1];
            ans = (double) ans / 2;
        } else if (N > K) {

            // Rの途中から取得する事で貪欲する
            for (int i = N - K; i < N; i++) {
                ans += R[i];
                ans = (double) ans / 2;
                System.err.println(i + " " + ans);
            }
        } else {

            // 0番目から探索しても全部取得できる
            for (int i = 0; i < N; i++) {
                ans += R[i];
                ans = (double) ans / 2;
            }
        }
        System.out.println(ans);
    }
}
