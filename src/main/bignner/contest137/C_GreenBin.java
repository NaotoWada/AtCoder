package main.bignner.contest137;

import java.util.Scanner;

public class C_GreenBin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            s[i] = calcByteVal(input);
        }

        long ans = solve(s, N);
        System.out.println(ans);
    }


    private static long solve(int[] s, int N) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.err.printf("%s %s %s %s\n", i, j, s[i], s[j]);
                if (s[i] == s[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static int calcByteVal(char[] input) {
        int ret = 0;
        for (char c : input) {
            ret += c;
        }
        return ret;
    }
}
