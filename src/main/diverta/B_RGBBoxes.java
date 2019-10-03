package main.diverta;

import java.util.Scanner;

public class B_RGBBoxes {

    // nCmax(r,g,b)
    public static void main(String[] args) {// 6minAC

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int R = Integer.parseInt(abt[0]);
        int G = Integer.parseInt(abt[1]);
        int B = Integer.parseInt(abt[2]);
        int N = Integer.parseInt(abt[3]);

        int max = max(R, G, B);
        System.out.println("取得:" + N + ": 最大:" + max);

        double powN = calc(N, max);
        System.out.println(powN);
        double powM = calc(max, max - 1);
        System.out.println(powM);

        double result = powN / powM;
        System.out.println((int) result);

    }

    private static int max(int... elm) {
        int max = 0;
        for (int i : elm) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static double calc(int term, int count) {

        double ret = 0;
        for (int i = 0; i < count; i++) {
            if (ret == 0) {
                ret = term * (term - 1);
            } else {
                ret = ret * (term - i - 1);
            }
        }
        return ret;
    }
}
