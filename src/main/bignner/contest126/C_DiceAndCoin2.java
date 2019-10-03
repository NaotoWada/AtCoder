package main.bignner.contest126;

import java.util.Scanner;

public class C_DiceAndCoin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double ans = 0.0;
        for (int i = 1; i <= n; i++) {

            double p = 1; // 確立
            int tmp = i; // Kに到達するまでの分子の部分

            while (tmp < k) {
                p *= 0.5;
                tmp *= 2;
            }
            ans += p / n; // Kを超えた場合は確率は増加する
        }

        System.out.println(ans);
    }
}
