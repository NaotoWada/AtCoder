package main.bignner.contest042;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_こだわり者いろはちゃん2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }

        int ans = solve(n, k, d);
        System.out.println(ans);
    }

    private static int solve(int n, int k, int[] d) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < d.length; i++) {
            set.add(d[i]);
        }

        int ans = 0;
        for (int i = n; i < n * 10; i++) {
            int tmp = i;
            boolean isAns = true;
            // 桁ごとに確認して、使用禁止数字があったら確認を抜けて次の数字へ移行する
            while (tmp > 0) {
                int t = tmp % 10;
                if (set.contains(t)) {
                    isAns = false;
                    break;
                }
                tmp /= 10;
            }

            // 確認をすべて通過できたらそれが答え
            if (isAns) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
