package main.bignner.selection;

import java.util.Arrays;
import java.util.Scanner;

public class D_Rain {

    private static int IN;
    private static int S[];
    private static int E[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IN = sc.nextInt();

        store(sc);
        sort();

    }

    private static void sort() {
        String[] joint = jointSE();
        Arrays.sort(joint);
        for (int i = 0; i < IN; i++) {
            String[] j = joint[i].split("-");
            S[i] = Integer.parseInt(j[0]);
            E[i] = Integer.parseInt(j[1]);
        }
    }

    private static String[] jointSE() {
        String[] joint = new String[IN];
        for (int i = 0; i < IN; i++) {
            joint[i] = S[i] + "-" + E[i];
        }
        return joint;
    }

    private static void store(Scanner sc) {
        S = new int[IN];
        E = new int[IN];
        for (int i = 0; i < IN; i++) {
            String[] spl = sc.next().split("-");
            S[i] = roundBefore(Integer.parseInt(spl[0]));
            E[i] = roundAfter(Integer.parseInt(spl[1]));
        }
    }

    private static int roundBefore(int i) {
        int m = i % 5;
        return m < 5 ? (i - m) : i - m + 5;
    }

    private static int roundAfter(int i) {
        int m = i % 5;
        if (m == 0) {
            return i;
        }
        int ret = m > 5 ? (i - m) : i - m + 5;
        if (String.valueOf(ret).endsWith("60")) {
            return ret + 40;
        } else {
            return ret;
        }
    }

}
