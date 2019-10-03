package main.bignner.contest063;

import java.util.Scanner;

public class D_Widespread2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] hn = new int[n];
        for (int i = 0; i < n; i++) {
            hn[i] = sc.nextInt();
        }

        int ans = solve(n, a, b, hn);
        System.out.println(ans);
    }

    static int solve(int n, int a, int b, int[] hn) {
        int ans = binSearch(hn, 0, a, b);
        return ans;
    }

    private static int binSearch(int[] h, int i, int a, int b) {
        int max = 1000000000;
        int min = 0;
        while (Math.abs(max - min) > 1) {
            int t = (max + min) / 2;
            if (isDelete(t, h, a, b)) {
                max = t;
            } else {
                min = t;
            }
        }
        System.out.printf("max%s min%s \n", max, min);
        return max;
    }

    private static boolean isDelete(int t, int[] h, int a, int b) {
        int cnt = 0;
        for (int i = 0; i < h.length; i++) {
            int hp = h[i];
            if (hp > b * t) {
                // b*tで倒せない敵
                int minT = (hp - b * t) / (a - b);
                int addT = (hp - b * t) % (a - b);
                cnt += minT + addT;
                System.out.printf("h%s t%s bt%s minT%s addT%s \n", hp, t, b * t, minT, addT);
            }
        }
        return cnt <= t ? true : false;
    }
}

