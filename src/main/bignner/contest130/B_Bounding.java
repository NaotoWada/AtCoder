package main.bignner.contest130;

import java.util.Scanner;

public class B_Bounding {

    public static void main(String[] args) { // 33m30s AC

        Scanner sc = new Scanner(System.in);

        String[] abt = sc.nextLine().split(" ");
        int N = Integer.parseInt(abt[0]);
        int X = Integer.parseInt(abt[1]);

        String[] LN = sc.nextLine().split(" ");
        int length = 0;
        int bound = 1;
        for (String l : LN) {
            int li = Integer.parseInt(l);
            length += li;

            if (length <= X) {
                bound++;
            }
        }

        System.out.println(bound);
    }
}
