package main.bignner.contest136;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class C_BuildStairs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(solve(n, h));
    }

    public static String solve(int n, int[] h) {
        // 各要素が何番目か記録する
        Map<Integer, Integer> order = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int hi = h[i];
            order.put(hi, i + 1);
        }

        Set<Integer> memo = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int hi = h[i];
            if (memo.contains(hi)) {
                continue;
            }

            for (int j = 1; j < hi - 2; j++) {
                if (order.get(j) != null) {
                    int lastPoint = order.get(j);
                    if (lastPoint > i) {
                        return "No";
                    }
                }
            }

            memo.add(hi);
        }
        return "Yes";
    }
}


