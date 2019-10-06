package main.bignner.contest120;

import java.util.Scanner;

public class C_Unification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = solve(s);
        System.out.println(ans);
    }

    static int solve(String s) {
        String tmp = s;
        for (int i = 0; i < s.length(); i++) {
            tmp = tmp.replace("01", "").replace("10", "");
        }
        System.err.printf("%s \n%s\n", s, tmp);
        return s.length() - tmp.length();
    }
}
