package main.bignner.contest116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D_VariousSushi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] sushi = new long[n][2];
        for (int i = 0; i < n; ++i) {
            sushi[i][0] = sc.nextLong();
            sushi[i][1] = sc.nextLong();
        }

        // 寿司のおいしさで降順ソートする
        Arrays.sort(sushi, (a, b) -> Long.signum(b[1] - a[1]));

        // 寿司の種類ごとの個数を保持っておく為の枠作り
        Map<Long, Integer> kind = new HashMap<>();
        for (int i = 0; i < n; i++) {
            kind.put((long) i + 1, 0);
        }

        List<long[]> normalSushi = new ArrayList<>();
        long delicious = 0;
        for (int i = 0; i < k; ++i) {
            long[] item = sushi[i];
            long sushiType = item[0];
            long sushiDeli = item[1];

            if (kind.get(sushiType) > 0) {
                // ボーナスにならない寿司を詰める
                normalSushi.add(item);
            }

            delicious += sushiDeli;
            kind.put(sushiType, kind.get(sushiType) + 1);
        }

        // 最初に食べた寿司以外を詰める
        List<long[]> otherSushi = new ArrayList<>();
        Set<Long> otherVariety = new HashSet<>();
        for (int i = k; i < n; ++i) {
            long[] item = sushi[i];
            long sushiType = item[0];
            if (kind.get(sushiType) == 0 && !otherVariety.contains(sushiType)) {
                otherVariety.add(sushiType);
                otherSushi.add(item);
            }
        }

        // 今何種類食べたかカウントする
        long variety = kind.values().stream().filter(s -> s != 0).count();

        long base = delicious + variety * variety;
        long ans = base;

        // 何個入れ替えるかでループ
        long loss = 0;
        long gain = 0;
        for (int i = 0; i < Math.min(otherSushi.size(), normalSushi.size()); ++i) {
            int remIdx = i;
            int replIdx = normalSushi.size() - (i + 1);
            gain = (2 * variety + i + 1) * (i + 1);
            loss += normalSushi.get(replIdx)[1] - otherSushi.get(remIdx)[1];
            ans = Math.max(ans, base + gain - loss);
        }

        System.out.println(ans);
    }

    static class Sushi implements Comparable<Sushi> {
        long t;
        long d;

        Sushi(long t, long d) {
            this.t = t;
            this.d = d;
        }

        @Override
        public int compareTo(Sushi o) {
            return (int) (this.d - o.d);
        }

    }
}

