package main.japanstudent.contest01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_EqualWeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] ans = solve(n, m, a, b);
        boolean canNotCreate = Arrays.stream(ans).allMatch(s -> s == 0);
        if (canNotCreate) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < 4; i++) {
                System.out.println(ans[i]);
            }
        }
    }

    static int[] solve(int n, int m, int[] a, int[] b) {
        Map<Integer, int[]> weightMap = new HashMap<>();
        int[] ans = new int[4];
        for (int i = 0; i < n; i++) {
            int rice = a[i];
            for (int j = 0; j < m; j++) {
                int fish = b[j];
                int weight = rice + fish;

                if (weightMap.containsKey(weight)) {
                    // 既に存在する組み合わせだったら抜ける
                    int[] sushi = weightMap.get(weight);
                    ans[0] = sushi[0];
                    ans[1] = sushi[1];
                    ans[2] = i;
                    ans[3] = j;
                    break;
                }
                int[] val = { i, j };
                weightMap.put(weight, val);
            }
        }

        return ans;
    }
}
