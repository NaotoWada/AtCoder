package main.bignner.contest142;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E_GetEverything {

    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        Treasure[] treasure = new Treasure[M];
        for (int i = 0; i < M; i++) {
            int price = Integer.parseInt(sc.nextLine().split(" ")[0]);
            String[] opens = sc.nextLine().split(" ");
            Treasure t = new Treasure(price, opens);
            treasure[i] = t;
        }
        Arrays.sort(treasure);

        int ans = 0;
        Set<Integer> wantOpen = new HashSet<>();
        for (int i = 0; i < treasure.length; i++) {
            Treasure t = treasure[i];
            wantOpen = t.open;
        }
        System.out.println();
    }

    static class Treasure implements Comparable<Treasure> {
        int price;
        Set<Integer> open = new HashSet<>();
        Set<Integer> not = new HashSet<>();

        public Treasure(int price, String... opens) {
            this.price = price;
            for (int i = 0; i < opens.length; i++) {
                open.add(Integer.parseInt(opens[i]));
            }
            for (int i = 1; i <= N; i++) {
                if (!open.contains(i)) {
                    not.add(i);
                }
            }
        }

        public boolean isContains(int num) {
            return open.contains(num);
        }

        @Override
        public int compareTo(Treasure o) {
            // 値段で昇順ソート
            return this.price - o.price;
        }

        @Override
        public String toString() {
            return String.format("%s : %s - %s\n", price, open, not);
        }
    }
}
