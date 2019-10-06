package main.bignner.contest108;

import java.util.Scanner;

public class B_RuinedSquare3 {

    public static void main(String[] args) {
        // 解説後に再実装
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[] ans = solve(x1, y1, x2, y2);
        for (int elm : ans) {
            System.out.printf("%s ", elm);
        }
    }

    static int[] solve(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;

        int[] ans = new int[4];
        int x3 = x2 - y;
        int y3 = y2 + x;
        int x4 = x1 - y;
        int y4 = y1 + x;

        ans[0] = x3;
        ans[1] = y3;
        ans[2] = x4;
        ans[3] = y4;

        return ans;
    }
}

