package main.bignner.contest064;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_ColorfulLeaderborad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> s = new HashSet<>();
        int cameleon = 0;
        for (int i = 0; i < n; i++) {
            int rank = a[i] / 400 + 1;
            if (rank > 8) {
                cameleon++;
            } else {
                s.add(rank);
            }
        }

        // 3200のみの場合は最小ケースと最大ケースは同値
        int min = s.size() == 0 ? 1 : s.size();

        // 3200以上の場合は加算
        int max = s.size() + cameleon;

        // 最大8種
        max = max > 8 ? 8 : max;

        System.out.println(min);
        System.out.println(max);
    }
}
