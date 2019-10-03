package main.bignner.contest089;

import java.util.HashMap;
import java.util.Map;

public class C_March6 {

    static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(0, "M");
        map.put(1, "A");
        map.put(2, "R");
        map.put(3, "C");
        map.put(4, "H");
    }

    public static void main(String[] args) {
        int[] march = { 1, 1, 2, 1, 0 };
        long ans = solve(5, march);
        System.out.println(ans);
    }

    public static long solve(int n, int[] march) {
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    long tmp = (long) march[i] * march[j] * march[k];
                    System.out.println(map.get(i) + map.get(j) + map.get(k) + " " + tmp);
                    ans += tmp;
                }
            }
        }
        return ans;
    }
}
