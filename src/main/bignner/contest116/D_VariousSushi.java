package main.bignner.contest116;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class D_VariousSushi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] td = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                td[i][j] = sc.nextInt();
            }
        }
        int ans = solve(n, k, td);
        System.out.println(ans);

    }

    private static int solve(int n, int k, int[][] td) {

        // 種類ごとのおいしさをMAP化する
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int type = td[i][0];
            if (m.containsKey(type)) {
                List<Integer> vlist = m.get(type);
                vlist.add(td[i][1]);
                m.put(type, vlist);
            } else {
                List<Integer> vlist = new ArrayList<>();
                vlist.add(td[i][1]);
                m.put(type, vlist);
            }
        }

        // 種類の中で一番おいしい寿司と、それ以外で配列を分けておいて貪欲する
        Queue<Integer> special = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> normal = new PriorityQueue<>(Comparator.reverseOrder());

        for (Entry<Integer, List<Integer>> ent : m.entrySet()) {
            List<Integer> vlist = ent.getValue();
            vlist.sort(Comparator.reverseOrder());
            for (int i = 0; i < vlist.size(); i++) {
                if (i == 0) {
                    special.add(vlist.get(i));
                } else {
                    normal.add(vlist.get(i));
                }
            }
        }

        return 0;
    }

    class Pair implements Comparable<Integer> {
        int typeNum;
        int delicious;

        Pair(int t, int d) {
            this.typeNum = t;
            this.delicious = d;
        }

        @Override
        public int compareTo(Integer o) {
            return this.delicious - o;
        }
    }
}
