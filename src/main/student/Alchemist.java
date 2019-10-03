package main.student;

import java.util.Scanner;

public class Alchemist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] MD = sc.nextLine().split(" ");
        int M = Integer.parseInt(MD[0]);
        int D = Integer.parseInt(MD[1]);

        int ans = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= D; j++) {
                int d10 = j / 10;
                int d1 = j % 10;
                if (!(d10 >= 2 && d1 >= 2)) {
                    continue;
                }
                if (d10 * d1 == i) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
